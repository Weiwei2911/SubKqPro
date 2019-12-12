package com.bnuz.kq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnuz.kq.bean.UserInfo;
import com.bnuz.kq.dao.UserInfoMapper;

@Service
public class UserInfoService {
      
	@Autowired
	private UserInfoMapper userInfoMapper;

	public List<UserInfo> getUserInfo() {
		// TODO Auto-generated method stub
		List<UserInfo> list = userInfoMapper.selectByExample(null);
		return list;
	}
}
