package com.bnuz.kq.controller;

import io.swagger.annotations.ApiOperation;

import java.util.ArrayList;
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
import com.bnuz.kq.bean.Msg;
import com.bnuz.kq.bean.Setdept;
import com.bnuz.kq.bean.UserInfo;
import com.bnuz.kq.service.DepartmentService;
import com.bnuz.kq.service.SetDepService;
import com.bnuz.kq.service.UserInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


/**
 * @author zhw
 * 处理与员工有关请求
 *
 */
@Controller
public class UserInfoController {
	
    @Autowired
    private UserInfoService userInfoService;
    
    @Autowired
    private DepartmentService departmentService;
    
    @Autowired
    private SetDepService setDepService;
    
    //查出所有员工信息
    @RequestMapping("/usersinfo")
	@ResponseBody	
	@ApiOperation(value = "员工信息GET")
	public Msg getDepts(@RequestParam(value = "page",defaultValue = "1")Integer page,@RequestParam(value = "limit",defaultValue = "5")Integer limit, Model model){
    	
    	PageHelper.startPage(page,limit);
		List<UserInfo> list = userInfoService.getUserInfo();
		
		PageInfo pnlist = new PageInfo(list,limit);
		
		return Msg.success().add("usersinfo", pnlist);
	}
    
    
    //查出指定部门员工信息
    @RequestMapping(value="/getdepuser/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getDepuser(@PathVariable("id")Integer id,@RequestParam(value = "page",defaultValue = "1")Integer page,@RequestParam(value = "limit",defaultValue = "5")Integer limit, Model model){
    	PageHelper.startPage(page,limit);
		Department department = departmentService.getonedep(id);
		List<Setdept> list = setDepService.getDepUsers();
		List<Setdept> list2 = new ArrayList<Setdept>();
		for(int i=0;i<list.size();i++){
			if(list.get(i).getDeptId() == department.getDeptId()){
				list2.add(list.get(i));
			}
		}
		
		PageInfo pnlist = new PageInfo(list2,limit);
		return Msg.success().add("Onedepuser", pnlist);
	}
    
}
