package com.bnuz.kq.utils;


import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bnuz.kq.bean.Allkqdata;
import com.bnuz.kq.bean.LogData;
import com.bnuz.kq.bean.UserInfo;
import com.bnuz.kq.dao.UserInfoMapper;
import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.DispatchEvents;
import com.jacob.com.STA;
import com.jacob.com.Variant;
import com.mysql.jdbc.Connection;

public class ZkemSDKUtils {
	//单例模式
	private   static ZkemSDKUtils zkemSDKUtils2;
    public  ZkemSDKUtils(){}
    public static ZkemSDKUtils zkemSDKUtils2(){
    	if(zkemSDKUtils2 == null){
    		zkemSDKUtils2 =new ZkemSDKUtils();
    	}
    	return zkemSDKUtils2;
    }
	/*private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/busattend?useUnicode=true&characterEncoding=utf8";
	private static final String USER = "root";
	private static final String PASSWORD = "123456";*/
	
	//连接数据库
	/*public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DRIVER_CLASS_NAME);
			conn = (Connection) DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
			return conn;
		} catch (Exception e) {
			return null;
		}
	}*/
	
  

	public static void main(String[] args) throws IOException {
		ZkemSDKUtils sk =new ZkemSDKUtils();
        boolean flag = readGeneralLogData();
        List<Allkqdata> logDateList = new ArrayList<Allkqdata>();
        //需要运行下getGeneralLogData方法才能使getUserOneDayInfo2list有值
        List<Map<String, Object>> generalLogDataAll = ZkemSDKUtils.getGeneralLogData();
        
        System.out.println("==============1111");
        System.out.println(generalLogDataAll.size());
        
        logDateList = ZkemSDKUtils.convertMaps2List(generalLogDataAll);
        
        	System.out.println(logDateList.toString());
       
        
        System.out.println("==============2222");
       /* List<Map<String, Object>> generalLogData = ZkemSDKUtils.getGeneralLogData();
        System.out.println(generalLogData.toString());*/
        /* Map<String, Object>   userInfoByNumber = ZkemSDKUtils.getUserInfoByNumber("1");
         System.out.println(userInfoByNumber);*/
        /*boolean auth = ZkemSDKUtils.setUserInfo("8", "唐", null, 0,true);
        System.out.println(auth);*/
        List<UserInfo> userInfo = ZkemSDKUtils.getUserInfo();
        System.out.println(userInfo.toString());
     
        regEvent();
    }
    
   /* public static void batch(Object[][] userInfo) {
        QueryRunner queryRunner = new QueryRunner(true);
        String sql = "INSERT INTO userinfo VALUES (?,?,?,?)";
        try {
            queryRunner.batch(getConnection(), sql, userInfo);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/
	
    {
        boolean connect = connect("192.168.108.8",4370);
    }
    //zkemkeeper.ZKEM.1 为zkemkeeper.dll 注册成功后 在注册表可以查看：HKEY_CLASSES_ROOT最下面
    private static ActiveXComponent zkem = new ActiveXComponent("zkemkeeper.ZKEM.1");

    /**
     * 连接考勤机
     *
     * @param address 考勤机地址
     * @param port    端口号
     * @return
     */
    public static boolean connect(String address, int port) {
        boolean result = zkem.invoke("Connect_NET", address, port).getBoolean();
        return result;
    }

    /**
     * 启动事件监听
     */
    public static void  regEvent(){
        zkem.invoke("RegEvent", new Variant(1), new Variant(65535));
        zkem.invoke("ReadRTLog", new Variant(1));
        zkem.invoke("GetRTLog", new Variant(1));

        new DispatchEvents(zkem.getObject(), new SensorEvents());
        new STA().doMessagePump();
    }
    /**
     * 读取考勤记录到pc缓存。配合getGeneralLogData使用
     *
     * @return
     */
    public static boolean readGeneralLogData() {
        boolean result = zkem.invoke("ReadGeneralLogData",4).getBoolean();
        return result;
    }

    /**
     * 读取该时间之后的最新考勤数据。 配合getGeneralLogData使用。//网上说有这个方法，但是我用的开发文档没有这个方法，也调用不到，我在controller中处理获取当天数据
     *
     * @param lastest
     * @return
     */
    /*public static boolean readLastestLogData(Date lastest) {
        boolean result = zkem.invoke("ReadLastestLogData", 2018 - 07 - 24).getBoolean();
        return result;
    }*/

    /**
     * 获取缓存中的考勤数据。配合readGeneralLogData / readLastestLogData使用。
     *
     * @return 返回的map中，包含以下键值：
     * "EnrollNumber"   人员编号
     * "Time"           考勤时间串，格式: yyyy-MM-dd HH:mm:ss
     * "VerifyMode"     验证方式  1：指纹 2：面部识别
     * "InOutMode"      考勤状态 0：上班 1：下班 2：外出 3：外出返回 4：加班签到 5：加班签退
     * "Year"          考勤时间：年
     * "Month"         考勤时间：月
     * "Day"           考勤时间：日
     * "Hour"            考勤时间：时
     * "Minute"        考勤时间：分
     * "Second"        考勤时间：秒
     */
    public static  List<Map<String,Object>> getGeneralLogData(){
    	  Variant v0 = new Variant(1,true);
    	  Variant dwEnrollNumber = new Variant("",true);
    	  Variant dwVerifyMode = new Variant(0,true);
    	  Variant dwInOutMode = new Variant(0,true);
    	  Variant dwYear = new Variant(0,true);
    	  Variant dwMonth = new Variant(0,true);
    	  Variant dwDay = new Variant(0,true);
    	  Variant dwHour = new Variant(0,true);
    	  Variant dwMinute = new Variant(0,true);
    	  Variant dwSecond = new Variant(0,true);
    	  Variant dwWorkCode = new Variant(0,true);
    	  List<Map<String,Object>> strList = new ArrayList<Map<String,Object>>();
    	  boolean newresult = false;
    	  do{
    	   Variant   vResult = Dispatch.call(zkem, "SSR_GetGeneralLogData", v0,dwEnrollNumber,dwVerifyMode,dwInOutMode,dwYear,dwMonth,dwDay,dwHour,
    	     dwMinute,dwSecond,dwWorkCode);
    	   newresult = vResult.getBoolean();
    	   if(newresult)
    	   {
    	    String enrollNumber = dwEnrollNumber.getStringRef();
    	    
    	    //如果没有编号，则跳过。
    	     if(enrollNumber == null || enrollNumber.trim().length() == 0)
    	     continue;
    	    Map<String,Object> m = new HashMap<String, Object>();
    	    m.put("EnrollNumber", enrollNumber);
    	    m.put("Time", dwYear.getIntRef() + "-" + dwMonth.getIntRef() + "-" + dwDay.getIntRef() + " " + dwHour.getIntRef() + ":" + dwMinute.getIntRef() + ":" + dwSecond.getIntRef());
    	    m.put("VerifyMode", dwVerifyMode.getIntRef());
    	    m.put("InOutMode", dwInOutMode.getIntRef());
    	    m.put("Year", dwYear.getIntRef());
    	    m.put("Month", dwMonth.getIntRef());
    	    m.put("Day", dwDay.getIntRef());
    	    m.put("Hour", dwHour.getIntRef());
    	    m.put("Minute", dwMinute.getIntRef());
    	    m.put("Second", dwSecond.getIntRef());
    	    strList.add(m);
    	   }
    	  }while(newresult == true);
    	  
    	   return strList;
    	 }

    /**
     * 获取用户信息
     *
     * @return 返回的Map中，包含以下键值:
     * "EnrollNumber"  人员编号
     * "Name"          人员姓名
     * "Password"      人员密码
     * "Privilege"     特权 0位普通 3特权
     * "Enabled"       是否启用
     */
    public static List<UserInfo> getUserInfo() {
        List<UserInfo> userInfoList = new LinkedList<UserInfo>();
        //将用户数据读入缓存中。
        boolean result = zkem.invoke("ReadAllUserID", 1).getBoolean();

        Variant v0 = new Variant(1);
        Variant sdwEnrollNumber = new Variant("", true);
        Variant sName = new Variant("", true);
        Variant sPassword = new Variant("", true);
        Variant iPrivilege = new Variant(0, true);
        Variant bEnabled = new Variant(false, true);
        
        while (result) {
            //从缓存中读取一条条的用户数据
            result = zkem.invoke("SSR_GetAllUserInfo", v0, sdwEnrollNumber, sName, sPassword, iPrivilege, bEnabled).getBoolean();
            //如果没有编号，跳过。
            String enrollNumber = sdwEnrollNumber.getStringRef();
            if (enrollNumber == null || enrollNumber.trim().length() == 0)
                continue;

            //由于名字后面会产生乱码，所以这里采用了截取字符串的办法把后面的乱码去掉了，以后有待考察更好的办法。
            //只支持2位、3位、4位长度的中文名字。
            String name = sName.getStringRef();
            int index = name.indexOf("\0");
            String newStr = "";
            if (index>-1){
                name = name.substring(0,index);
            }
            if (sName.getStringRef().length() > 4) {
                name = sName.getStringRef().substring(0, 4);
            }
            //如果没有名字，跳过。
            if (name.trim().length() == 0)
                continue;
            UserInfo userInfo = new UserInfo();
            userInfo.setEnrollnumber(enrollNumber);
            userInfo.setName(name);
            userInfo.setPassword(sPassword.getStringRef());
            userInfo.setPrivilege(iPrivilege.getIntRef());
            userInfoList.add(userInfo);
        }
        return userInfoList;
    }

    /**
     * 设置用户信息
     *
     * @param number
     * @param name
     * @param password
     * @param isPrivilege 0為普通用戶,3為管理員;
     * @param enabled 是否啟用
     * @return
     */
    public static boolean setUserInfo(String number, String name, String password, int isPrivilege,boolean enabled) {
        Variant v0 = new Variant(1);
        Variant sdwEnrollNumber = new Variant(number, true);
        Variant sName = new Variant(name, true);
        Variant sPassword = new Variant(password, true);
        Variant iPrivilege = new Variant(isPrivilege, true);
        Variant bEnabled = new Variant(enabled, true);
        boolean result = zkem.invoke("SSR_SetUserInfo", v0, sdwEnrollNumber, sName, sPassword, iPrivilege,bEnabled).getBoolean();
        return result;
    }

    /**
     * 获取用户信息
     *
     * @param number 考勤号码
     * @return
     */
    public static Map<String, Object> getUserInfoByNumber(String number) {
        Variant v0 = new Variant(1);
        Variant sdwEnrollNumber = new Variant(number, true);
        Variant sName = new Variant("", true);
        Variant sPassword = new Variant("", true);
        Variant iPrivilege = new Variant(0, true);
        Variant bEnabled = new Variant(false, true);
        boolean result = zkem.invoke("SSR_GetUserInfo", v0, sdwEnrollNumber, sName, sPassword, iPrivilege, bEnabled).getBoolean();
        if (result) {
            Map<String, Object> m = new HashMap<String, Object>();
            m.put("EnrollNumber", number);
            m.put("Name", sName.getStringRef());
            m.put("Password", sPassword.getStringRef());
            m.put("Privilege", iPrivilege.getIntRef());
            m.put("Enabled", bEnabled.getBooleanRef());
            return m;
        }
        return null;
    }

   //直接查询所有打卡信息（非连接）
    
    public static List<Allkqdata> convertMaps2List( List<Map<String, Object>> generalLogDataAll){
    	List<Allkqdata> logDateList = new ArrayList<Allkqdata>();
        System.out.println("generalLogDataAll.size()="+generalLogDataAll.size());
           for (int i = 0; i < generalLogDataAll.size(); i++) {
               //System.out.println(generalLogDataAll.get(i));
               String Year =String.valueOf(generalLogDataAll.get(i).get("Year"));
               String Hour = String.valueOf(generalLogDataAll.get(i).get("Hour"));
               String InOutMode = String.valueOf(generalLogDataAll.get(i).get("InOutMode"));
               String Time = String.valueOf(generalLogDataAll.get(i).get("Time"));
               String Second = String.valueOf(generalLogDataAll.get(i).get("Second"));
               String Minute = String.valueOf(generalLogDataAll.get(i).get("Minute"));
               String EnrollNumber = String.valueOf(generalLogDataAll.get(i).get("EnrollNumber"));
               String Day = String.valueOf(generalLogDataAll.get(i).get("Day"));
               String Month = String.valueOf(generalLogDataAll.get(i).get("Month"));
               String VerifyMode = String.valueOf(generalLogDataAll.get(i).get("VerifyMode"));
               
               Allkqdata logData = new Allkqdata();
               logData.setYear(Year);
               logData.setHour(Hour);
               logData.setInoutmode(InOutMode);
               logData.setTime(Time);
               logData.setSecond(Second);
               logData.setMinute(Minute);
               logData.setEnrollnumber(EnrollNumber);
               logData.setDay(Day);
               logData.setMonth(Month);
               logData.setVerifymode(VerifyMode);
               logDateList.add(logData);

              
           }
           return logDateList; 
    	
    }
    
    public static List<LogData> getUserOneDayInfo2(Object userNumber){
        Map<String,Object> userInfo = new HashMap<String,Object>();
        List<LogData> logDateList = new ArrayList<LogData>();
         List<Map<String, Object>> generalLogDataAll = ZkemSDKUtils.getGeneralLogData();
         System.out.println("generalLogDataAll.size()="+generalLogDataAll.size());
            for (int i = 0; i < generalLogDataAll.size(); i++) {
                //System.out.println(generalLogDataAll.get(i));
                String Year =String.valueOf(generalLogDataAll.get(i).get("Year"));
                String Hour = String.valueOf(generalLogDataAll.get(i).get("Hour"));
                String InOutMode = String.valueOf(generalLogDataAll.get(i).get("InOutMode"));
                String Time = String.valueOf(generalLogDataAll.get(i).get("Time"));
                String Second = String.valueOf(generalLogDataAll.get(i).get("Second"));
                String Minute = String.valueOf(generalLogDataAll.get(i).get("Minute"));
                String EnrollNumber = String.valueOf(generalLogDataAll.get(i).get("EnrollNumber"));
                String Day = String.valueOf(generalLogDataAll.get(i).get("Day"));
                String Month = String.valueOf(generalLogDataAll.get(i).get("Month"));
                String VerifyMode = String.valueOf(generalLogDataAll.get(i).get("VerifyMode"));
                
                LogData logData = new LogData();
                logData.setYear(Year);
                logData.setHour(Hour);
                logData.setInoutmode(InOutMode);
                logData.setTime(Time);
                logData.setSecond(Second);
                logData.setMinute(Minute);
                logData.setEnrollnumber(EnrollNumber);
                logData.setDay(Day);
                logData.setMonth(Month);
                logData.setVerifymode(VerifyMode);

                if (EnrollNumber.equals(userNumber)&&userNumber!=null){
                    logDateList.add(logData);
                }else if (userNumber==null){
                    logDateList.add(logData);
                }
            }
            return logDateList;
    }
    
    

    /**
     * 查詢所有/指定ID的打卡信息;
     * @param userNumber
     * @return
     */
    public static List<LogData> getUserOneDayInfo(Object userNumber){
        Map<String,Object> userInfo = new HashMap<String,Object>();
        List<LogData> logDateList = new ArrayList<LogData>();
        //连接考勤机；
        boolean connect = connect("172.31.44.5", 4370);
        if(connect){
            List<Map<String, Object>> generalLogDataAll = ZkemSDKUtils.getGeneralLogData();
            for (int i = 0; i < generalLogDataAll.size(); i++) {
                //System.out.println(generalLogDataAll.get(i));
                String Year =String.valueOf(generalLogDataAll.get(i).get("Year"));
                String Hour = String.valueOf(generalLogDataAll.get(i).get("Hour"));
                String InOutMode = String.valueOf(generalLogDataAll.get(i).get("InOutMode"));
                String Time = String.valueOf(generalLogDataAll.get(i).get("Time"));
                String Second = String.valueOf(generalLogDataAll.get(i).get("Second"));
                String Minute = String.valueOf(generalLogDataAll.get(i).get("Minute"));
                String EnrollNumber = String.valueOf(generalLogDataAll.get(i).get("EnrollNumber"));
                String Day = String.valueOf(generalLogDataAll.get(i).get("Day"));
                String Month = String.valueOf(generalLogDataAll.get(i).get("Month"));
                String VerifyMode = String.valueOf(generalLogDataAll.get(i).get("VerifyMode"));
                
                LogData logData = new LogData();
                logData.setYear(Year);
                logData.setHour(Hour);
                logData.setInoutmode(InOutMode);
                logData.setTime(Time);
                logData.setSecond(Second);
                logData.setMinute(Minute);
                logData.setEnrollnumber(EnrollNumber);
                logData.setDay(Day);
                logData.setMonth(Month);
                logData.setVerifymode(VerifyMode);

                if (EnrollNumber.equals(userNumber)&&userNumber!=null){
                    logDateList.add(logData);
                }else if (userNumber==null){
                    logDateList.add(logData);
                }
            }
            return logDateList;
        }
        return null;
    }
    
    
    
    /**
     * 删除用户;
     */
    public static Boolean delectUserById(String dwEnrollNumber){
        Variant v0 = new Variant(1);
        Variant sdwEnrollNumber = new Variant(dwEnrollNumber, true);
        /**
         * sdwBackupNumber：
         * 一般范围为 0-9，同时会查询该用户是否还有其他指纹和密码，如都没有，则删除该用户
         * 当为 10 是代表删除的是密码，同时会查询该用户是否有指纹数据，如没有，则删除该用户
         * 11 和 13 是代表删除该用户所有指纹数据，
         * 12 代表删除该用户（包括所有指纹和卡号、密码数据）
         */
        Variant sdwBackupNumber = new Variant(12);
        /**
         * 删除登记数据，和 SSR_DeleteEnrollData 不同的是删除所有指纹数据可用参数 13 实现，该函数具有更高效率
         */
        return zkem.invoke("SSR_DeleteEnrollDataExt", v0, sdwEnrollNumber, sdwBackupNumber).getBoolean();
    }
}

