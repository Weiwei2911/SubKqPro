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

//处理员工信息crud
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
	
	//跳转到所有员工信息页面
	@RequestMapping("/allempsinfo")
	public String GoUser(){
		
		return 	"/allempsinfo";
	}
	
	//新增员工
	@RequestMapping(value="/addemp",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveEmp(Employee employee){
		employeeService.saveEmp(employee);
		return Msg.success();
	}
	
	//导入jackson为了转换为json数据
	//获取所有员工信息
	@RequestMapping("/getemps")
	@ResponseBody
	public Msg getEmpsWithJson(@RequestParam(value = "page",defaultValue = "1")Integer page,@RequestParam(value = "limit",defaultValue = "5")Integer limit, Model model){
		//分页查询
				//引入pagehelper,页码以及大小
				PageHelper.startPage(page,limit);
				//紧跟就是分页查询
				List<Employee> emps = employeeService.getAll();
				//使用PageInfo包装查询结果，PageInfo给页面
				//封装详细信息,连续显示5页
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
