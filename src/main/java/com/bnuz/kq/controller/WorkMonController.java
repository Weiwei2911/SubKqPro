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

import com.bnuz.kq.bean.Msg;
import com.bnuz.kq.bean.SetSche;
import com.bnuz.kq.bean.WorkMonths;
import com.bnuz.kq.service.WorkMonService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class WorkMonController {
    @Autowired
    private WorkMonService workmonService;
    
    //指定某个月
    @RequestMapping(value="/getworkmon/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getMon(@PathVariable("id")Integer id){
		
    	WorkMonths workmon = workmonService.getWorkMon(id);
		return Msg.success().add("setworkmon", workmon);
	}
    
    //所有月份
    @RequestMapping("/getworkmon")
   	@ResponseBody
   	public Msg getDepts(@RequestParam(value = "page",defaultValue = "1")Integer page,@RequestParam(value = "limit",defaultValue = "5")Integer limit, Model model){
    	PageHelper.startPage(page,limit);
   		List<WorkMonths> list = workmonService.getAll();
   		PageInfo pnlist = new PageInfo(list,limit);
   		return Msg.success().add("allworkmons", pnlist);
   	}
    
    //修改某月
    @RequestMapping(value="/updateworkmon",method=RequestMethod.PUT)
  	@ResponseBody
  	public Msg updateScheClass(WorkMonths workmonth){
    	workmonService.updateWorkMon(workmonth);
  		return Msg.success();
  	}
    
    
}
