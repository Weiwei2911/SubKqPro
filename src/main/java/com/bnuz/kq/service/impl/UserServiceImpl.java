package com.bnuz.kq.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnuz.kq.bean.BusUser;
import com.bnuz.kq.dao.BusUserMapper;
import com.bnuz.kq.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private BusUserMapper busUserMapper;
	
	public BusUser findUserByUsername(String username) {
		return busUserMapper.selectByUsername(username);
	}


	public Set<String> findPermissions(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> selectRolesByUsername(String username) {
		// TODO Auto-generated method stub
		return busUserMapper.selectRolesByUsername(username);
	}

	
	
}
