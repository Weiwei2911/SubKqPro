package com.bnuz.kq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnuz.kq.bean.Allkqdata;
import com.bnuz.kq.bean.LogData;
import com.bnuz.kq.bean.UserInfo;
import com.bnuz.kq.dao.AllkqdataMapper;
import com.bnuz.kq.dao.LogDataMapper;
import com.bnuz.kq.dao.UserInfoMapper;
import com.bnuz.kq.utils.ZkemSDKUtils;

@Service
public class MachineService {
     
	@Autowired
	private UserInfoMapper userInfoMapper;
	@Autowired
	private LogDataMapper logDataMapper;
	@Autowired
	private AllkqdataMapper allkqdataMapper;
	
	public void addUser(UserInfo userInfo){
		userInfoMapper.insertSelective(userInfo);
	}
	
	public void addAllUser(List<UserInfo> userInfo){
	    userInfo = ZkemSDKUtils.getUserInfo();
		userInfoMapper.insertUserInfo(userInfo);
	}
	
	public void addAllloglist(List<LogData> Logdatalist) {
		// TODO Auto-generated method stub
		logDataMapper.insertLogData(Logdatalist);
	}
	
	
	//插入所有考勤数据
	public void addAllkqlist(List<Allkqdata> logDateList) {
		// TODO Auto-generated method stub
		allkqdataMapper.insertAllkqData(logDateList);
	}
	
	

	
	
}
