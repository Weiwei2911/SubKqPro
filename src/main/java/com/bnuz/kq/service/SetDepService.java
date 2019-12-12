package com.bnuz.kq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnuz.kq.bean.Setdept;
import com.bnuz.kq.dao.SetdeptMapper;

@Service
public class SetDepService {
	@Autowired
	private SetdeptMapper setdeptMapper;

	public List<Setdept> getDepUsers() {
		// TODO Auto-generated method stub
		List<Setdept> list = setdeptMapper.selectByExample(null);
		return list;
	}
}
