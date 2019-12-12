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

import com.bnuz.kq.bean.Department;
import com.bnuz.kq.bean.Employee;
import com.bnuz.kq.bean.Msg;
import com.bnuz.kq.service.DepartmentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;



/**
 * @author zhw
 * �����벿���й�����
 *
 */
@Controller
public class DepartmentController {
	
	@Autowired
   private DepartmentService departmentService;
	
	/**
	 * @author zhw
	 * �������в�����Ϣ
	 *	
	 */
	@RequestMapping("/depts")
	@ResponseBody
	public Msg getDepts(@RequestParam(value = "page",defaultValue = "1")Integer page,@RequestParam(value = "limit",defaultValue = "5")Integer limit, Model model){
		//������в�����Ϣ
		PageHelper.startPage(page, limit);
		List<Department> list = departmentService.getDepts();
		PageInfo pnlist = new PageInfo(list,limit);
		return Msg.success().add("depts", pnlist);
	}
	
	//��ɾ
	
	
	//���ĳ����
	@RequestMapping(value="/getonedep/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getOnedep(@PathVariable("id")Integer id){
		
		Department department = departmentService.getonedep(id);
		return Msg.success().add("depname", department);
	}
	
	
	
	
}
