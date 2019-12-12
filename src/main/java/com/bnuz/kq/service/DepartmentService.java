package com.bnuz.kq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnuz.kq.bean.Department;
import com.bnuz.kq.bean.SetSche;
import com.bnuz.kq.dao.DepartmentMapper;



@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentMapper departmentMapper;

	public List<Department> getDepts() {
		// TODO Auto-generated method stub
		List<Department> list = departmentMapper.selectByExample(null);
		return list;
	}
	
	//按部门号查出指定部门
	public Department getonedep(Integer id) {
		// TODO Auto-generated method stub
		Department department =	departmentMapper.selectByPrimaryKey(id);
		return department;
	}
 
}
