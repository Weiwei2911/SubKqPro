package com.bnuz.kq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bnuz.kq.bean.Employee;
import com.bnuz.kq.bean.Msg;
import com.bnuz.kq.service.EmployeeServcie;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

//����Ա����Ϣcrud
@Controller
@RequestMapping("/emps")
public class EmployeeController {
   
	@Autowired
	EmployeeServcie employeeService;
	
	@RequestMapping(value="/getemp/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getEmp(@PathVariable("id")Integer id){
		
		Employee employee = employeeService.getEmp(id);
		return Msg.success().add("emp", employee);
	}
	
	//��ת������Ա����Ϣҳ��
	@RequestMapping("/allempsinfo")
	public String GoUser(){
		
		return 	"/allempsinfo";
	}
	
	//����Ա��
	@RequestMapping(value="/addemp",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveEmp(Employee employee){
		employeeService.saveEmp(employee);
		return Msg.success();
	}
	
	//����jacksonΪ��ת��Ϊjson����
	//��ȡ����Ա����Ϣ
	@RequestMapping("/getemps")
	@ResponseBody
	public Msg getEmpsWithJson(@RequestParam(value = "page",defaultValue = "1")Integer page,@RequestParam(value = "limit",defaultValue = "5")Integer limit, Model model){
		//��ҳ��ѯ
				//����pagehelper,ҳ���Լ���С
				PageHelper.startPage(page,limit);
				//�������Ƿ�ҳ��ѯ
				List<Employee> emps = employeeService.getAll();
				//ʹ��PageInfo��װ��ѯ�����PageInfo��ҳ��
				//��װ��ϸ��Ϣ,������ʾ5ҳ
				PageInfo pnlist =new PageInfo(emps,limit);
				return Msg.success().add("pageInfo",pnlist);
	}
	
	
	

	
	
	
	/*@RequestMapping("/allemps")
	public String GoAdmin(){
		
		List<Employee> emps = employeeService.getAll();
	}	
	
	@RequestMapping("/myemp")
	public String GoUser(){
		
		List<Employee> emps = employeeService.getAll();
		return 	"/user";
	}*/
	
	
	
}
