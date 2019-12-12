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
		System.out.println("���ɹ����ӻ���ʱ�������¼����޷���ֵ====");
	}

	public void OnDisConnected(Variant[] arge){
		System.out.println("���Ͽ�����ʱ�������¼����޷���ֵ====");
	}

	public void OnAlarm(Variant[] arge){
		System.out.println("����������ʱ�������¼�===="+arge);
	}

	/*private static ActiveXComponent zkem = new ActiveXComponent("zkemkeeper.ZKEM.1");
	
	  public static boolean connect(String address, int port) {
	        boolean result = zkem.invoke("Connect_NET", address, port).getBoolean();
	        return result;
	    }*/
	
	
	public void OnAttTransactionEx(Variant[] arge) throws IOException{
	
		System.out.println("id:"+arge[0]);
		System.out.println("�Ƿ���Ч:0��Ч 1��Ч"+arge[1]);
		System.out.println("����״̬:0 �ϰ� 1�°� 2��� 3������� 4 �Ӱ�ǩ�� 5 �Ӱ�ǩ��...."+arge[2]);
		System.out.println("��֤��ʽ 0:����  1;ָ�� 15:ˢ����֤"+arge[3]);
		System.out.println("��֤ʱ��"+arge[4]+"-"+arge[5]+"-"+arge[6]+"-"+arge[7]+":"+arge[8]+":"+arge[9]+" "+arge[10]);
		
		
			System.out.println("���2222222222222222222222222**");
		System.out.println("����֤ͨ��ʱ�������¼�====**"+arge);
	}

	public void OnEnrollFingerEx(Variant[] arge){
		System.out.println("�Ǽ�ָ��ʱ�������¼�====zhw"+arge.clone());
	}

	public void OnFinger(Variant[] arge){
		System.out.println("��������ָ��ͷ�ϼ�⵽��ָ��ʱ��������Ϣ���޷���ֵ");
	}

	public void OnFingerFeature(Variant[] arge){
		System.out.println("�Ǽ��û�ָ��ʱ������ָ�ư���ʱ��������Ϣ===="+arge);
	}

	public void OnHIDNum(Variant[] arge){
		System.out.println("��ˢ��ʱ��������Ϣ===="+arge);
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
		System.out.println("���ɹ��Ǽ����û�ʱ��������Ϣ===="+arge);
		
	}

	public void OnVerify(Variant[] arge) throws IOException{
		System.out.println("���û���֤ʱ��������Ϣ===="+arge);
	}

	public void OnWriteCard(Variant[] arge){
		System.out.println("����������д������ʱ�������¼�===="+arge);
	}

	public void OnEmptyCard(Variant[] arge){
		System.out.println("����� MIFARE ������ʱ�������¼�===="+arge);
	}

	public void OnEMData(Variant[] arge){
		System.out.println("�������� SDK ����δ֪�¼�ʱ���������¼�===="+arge);
	}
	
	public void OnDeleteTemplate(Variant[] arge){
		System.out.println("ɾ���û�===="+arge);
	}

} 

