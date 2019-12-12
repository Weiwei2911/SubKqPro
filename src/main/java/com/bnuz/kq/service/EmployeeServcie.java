package com.bnuz.kq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnuz.kq.bean.Employee;
import com.bnuz.kq.dao.EmployeeMapper;

@Service
public class EmployeeServcie {

	@Autowired
	EmployeeMapper employeeMapper;
	
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employeeMapper.selectByExample(null);
	}

	//����Ա��
	public void saveEmp(Employee employee) {
		// TODO Auto-generated method stub
		employeeMapper.insertSelective(employee);
	}

	//����Ա��id��ѯ
	public Employee getEmp(Integer id) {
		// TODO Auto-generated method stub
	Employee employee =	employeeMapper.selectByPrimaryKey(id);
		return employee;
	}

}
