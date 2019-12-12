package com.bnuz.kq.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bnuz.kq.bean.LogData;
import com.bnuz.kq.bean.UserInfo;
import com.bnuz.kq.dao.AllkqdataMapper;
import com.bnuz.kq.dao.ScheduleMapper;
import com.bnuz.kq.dao.UserInfoMapper;
import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Variant;

public class SensorEvents {
	
	void OnConnected(Variant[] arge){
		System.out.println("当成功连接机器时触发该事件，无返回值====");
	}

	public void OnDisConnected(Variant[] arge){
		System.out.println("当断开机器时触发该事件，无返回值====");
	}

	public void OnAlarm(Variant[] arge){
		System.out.println("当机器报警时触发该事件===="+arge);
	}

	/*private static ActiveXComponent zkem = new ActiveXComponent("zkemkeeper.ZKEM.1");
	
	  public static boolean connect(String address, int port) {
	        boolean result = zkem.invoke("Connect_NET", address, port).getBoolean();
	        return result;
	    }*/
	
	
	public void OnAttTransactionEx(Variant[] arge) throws IOException{
	
		System.out.println("id:"+arge[0]);
		System.out.println("是否有效:0有效 1无效"+arge[1]);
		System.out.println("考勤状态:0 上班 1下班 2外出 3外出返回 4 加班签到 5 加班签退...."+arge[2]);
		System.out.println("验证方式 0:密码  1;指纹 15:刷脸认证"+arge[3]);
		System.out.println("验证时间"+arge[4]+"-"+arge[5]+"-"+arge[6]+"-"+arge[7]+":"+arge[8]+":"+arge[9]+" "+arge[10]);
		
		
			System.out.println("完成2222222222222222222222222**");
		System.out.println("当验证通过时触发该事件====**"+arge);
	}

	public void OnEnrollFingerEx(Variant[] arge){
		System.out.println("登记指纹时触发该事件====zhw"+arge.clone());
	}

	public void OnFinger(Variant[] arge){
		System.out.println("当机器上指纹头上检测到有指纹时触发该消息，无返回值");
	}

	public void OnFingerFeature(Variant[] arge){
		System.out.println("登记用户指纹时，当有指纹按下时触发该消息===="+arge);
	}

	public void OnHIDNum(Variant[] arge){
		System.out.println("当刷卡时触发该消息===="+arge);
	}

	public void OnNewUser(Variant[] arge) throws IOException{
		 List<UserInfo> userInfo = ZkemSDKUtils.getUserInfo();
		 System.out.println("========"+userInfo.toString());
		 InputStream inputStream = Resources.getResourceAsStream("mybatis-config2.xml");
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = factory.openSession();
			UserInfoMapper mapper = sqlSession.getMapper(UserInfoMapper.class);
			ScheduleMapper mapper2 = sqlSession.getMapper(ScheduleMapper.class);
			mapper.insertUserInfo(userInfo);
			mapper2.updateByUserInfo(null);
			sqlSession.commit();
		System.out.println("当成功登记新用户时触发该消息===="+arge);
		
	}

	public void OnVerify(Variant[] arge) throws IOException{
		System.out.println("当用户验证时触发该消息===="+arge);
	}

	public void OnWriteCard(Variant[] arge){
		System.out.println("当机器进行写卡操作时触发该事件===="+arge);
	}

	public void OnEmptyCard(Variant[] arge){
		System.out.println("当清空 MIFARE 卡操作时触发该事件===="+arge);
	}

	public void OnEMData(Variant[] arge){
		System.out.println("当机器向 SDK 发送未知事件时，触发该事件===="+arge);
	}
	
	public void OnDeleteTemplate(Variant[] arge){
		System.out.println("删除用户===="+arge);
	}

} 

