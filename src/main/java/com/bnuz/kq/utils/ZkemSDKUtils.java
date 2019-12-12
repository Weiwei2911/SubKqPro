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
	//����ģʽ
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
	
	//�������ݿ�
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
        //��Ҫ������getGeneralLogData��������ʹgetUserOneDayInfo2list��ֵ
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
        /*boolean auth = ZkemSDKUtils.setUserInfo("8", "��", null, 0,true);
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
    //zkemkeeper.ZKEM.1 Ϊzkemkeeper.dll ע��ɹ��� ��ע�����Բ鿴��HKEY_CLASSES_ROOT������
    private static ActiveXComponent zkem = new ActiveXComponent("zkemkeeper.ZKEM.1");

    /**
     * ���ӿ��ڻ�
     *
     * @param address ���ڻ���ַ
     * @param port    �˿ں�
     * @return
     */
    public static boolean connect(String address, int port) {
        boolean result = zkem.invoke("Connect_NET", address, port).getBoolean();
        return result;
    }

    /**
     * �����¼�����
     */
    public static void  regEvent(){
        zkem.invoke("RegEvent", new Variant(1), new Variant(65535));
        zkem.invoke("ReadRTLog", new Variant(1));
        zkem.invoke("GetRTLog", new Variant(1));

        new DispatchEvents(zkem.getObject(), new SensorEvents());
        new STA().doMessagePump();
    }
    /**
     * ��ȡ���ڼ�¼��pc���档���getGeneralLogDataʹ��
     *
     * @return
     */
    public static boolean readGeneralLogData() {
        boolean result = zkem.invoke("ReadGeneralLogData",4).getBoolean();
        return result;
    }

    /**
     * ��ȡ��ʱ��֮������¿������ݡ� ���getGeneralLogDataʹ�á�//����˵������������������õĿ����ĵ�û�����������Ҳ���ò���������controller�д����ȡ��������
     *
     * @param lastest
     * @return
     */
    /*public static boolean readLastestLogData(Date lastest) {
        boolean result = zkem.invoke("ReadLastestLogData", 2018 - 07 - 24).getBoolean();
        return result;
    }*/

    /**
     * ��ȡ�����еĿ������ݡ����readGeneralLogData / readLastestLogDataʹ�á�
     *
     * @return ���ص�map�У��������¼�ֵ��
     * "EnrollNumber"   ��Ա���
     * "Time"           ����ʱ�䴮����ʽ: yyyy-MM-dd HH:mm:ss
     * "VerifyMode"     ��֤��ʽ  1��ָ�� 2���沿ʶ��
     * "InOutMode"      ����״̬ 0���ϰ� 1���°� 2����� 3��������� 4���Ӱ�ǩ�� 5���Ӱ�ǩ��
     * "Year"          ����ʱ�䣺��
     * "Month"         ����ʱ�䣺��
     * "Day"           ����ʱ�䣺��
     * "Hour"            ����ʱ�䣺ʱ
     * "Minute"        ����ʱ�䣺��
     * "Second"        ����ʱ�䣺��
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
    	    
    	    //���û�б�ţ���������
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
     * ��ȡ�û���Ϣ
     *
     * @return ���ص�Map�У��������¼�ֵ:
     * "EnrollNumber"  ��Ա���
     * "Name"          ��Ա����
     * "Password"      ��Ա����
     * "Privilege"     ��Ȩ 0λ��ͨ 3��Ȩ
     * "Enabled"       �Ƿ�����
     */
    public static List<UserInfo> getUserInfo() {
        List<UserInfo> userInfoList = new LinkedList<UserInfo>();
        //���û����ݶ��뻺���С�
        boolean result = zkem.invoke("ReadAllUserID", 1).getBoolean();

        Variant v0 = new Variant(1);
        Variant sdwEnrollNumber = new Variant("", true);
        Variant sName = new Variant("", true);
        Variant sPassword = new Variant("", true);
        Variant iPrivilege = new Variant(0, true);
        Variant bEnabled = new Variant(false, true);
        
        while (result) {
            //�ӻ����ж�ȡһ�������û�����
            result = zkem.invoke("SSR_GetAllUserInfo", v0, sdwEnrollNumber, sName, sPassword, iPrivilege, bEnabled).getBoolean();
            //���û�б�ţ�������
            String enrollNumber = sdwEnrollNumber.getStringRef();
            if (enrollNumber == null || enrollNumber.trim().length() == 0)
                continue;

            //�������ֺ����������룬������������˽�ȡ�ַ����İ취�Ѻ��������ȥ���ˣ��Ժ��д�������õİ취��
            //ֻ֧��2λ��3λ��4λ���ȵ��������֡�
            String name = sName.getStringRef();
            int index = name.indexOf("\0");
            String newStr = "";
            if (index>-1){
                name = name.substring(0,index);
            }
            if (sName.getStringRef().length() > 4) {
                name = sName.getStringRef().substring(0, 4);
            }
            //���û�����֣�������
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
     * �����û���Ϣ
     *
     * @param number
     * @param name
     * @param password
     * @param isPrivilege 0����ͨ�Ñ�,3�����T;
     * @param enabled �Ƿ���
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
     * ��ȡ�û���Ϣ
     *
     * @param number ���ں���
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

   //ֱ�Ӳ�ѯ���д���Ϣ�������ӣ�
    
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
     * ��ԃ����/ָ��ID�Ĵ���Ϣ;
     * @param userNumber
     * @return
     */
    public static List<LogData> getUserOneDayInfo(Object userNumber){
        Map<String,Object> userInfo = new HashMap<String,Object>();
        List<LogData> logDateList = new ArrayList<LogData>();
        //���ӿ��ڻ���
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
     * ɾ���û�;
     */
    public static Boolean delectUserById(String dwEnrollNumber){
        Variant v0 = new Variant(1);
        Variant sdwEnrollNumber = new Variant(dwEnrollNumber, true);
        /**
         * sdwBackupNumber��
         * һ�㷶ΧΪ 0-9��ͬʱ���ѯ���û��Ƿ�������ָ�ƺ����룬�綼û�У���ɾ�����û�
         * ��Ϊ 10 �Ǵ���ɾ���������룬ͬʱ���ѯ���û��Ƿ���ָ�����ݣ���û�У���ɾ�����û�
         * 11 �� 13 �Ǵ���ɾ�����û�����ָ�����ݣ�
         * 12 ����ɾ�����û�����������ָ�ƺͿ��š��������ݣ�
         */
        Variant sdwBackupNumber = new Variant(12);
        /**
         * ɾ���Ǽ����ݣ��� SSR_DeleteEnrollData ��ͬ����ɾ������ָ�����ݿ��ò��� 13 ʵ�֣��ú������и���Ч��
         */
        return zkem.invoke("SSR_DeleteEnrollDataExt", v0, sdwEnrollNumber, sdwBackupNumber).getBoolean();
    }
}

