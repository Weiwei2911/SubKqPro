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
import com.bnuz.kq.bean.Schedule;
import com.bnuz.kq.bean.SetSche;
import com.bnuz.kq.service.ScheduleService;
import com.bnuz.kq.service.SetScheService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class ScheduleController {
	@Autowired
    private ScheduleService scheduleService;
	
	@Autowired
	private SetScheService setScheService;
	
	//导入jackson包转换
	@RequestMapping("/getbusscheinfo")
	@ResponseBody
	public Msg getBusSches(@RequestParam(value = "page",defaultValue = "1")Integer page,@RequestParam(value = "limit",defaultValue = "5")Integer limit, Model model){
		PageHelper.startPage(page,limit);
		List<Schedule> busscheinfo = scheduleService.getScheduleinfo();
		PageInfo pnlist = new PageInfo(busscheinfo,limit);
		return Msg.success().add("Busscheinfo", pnlist);
	}
   
    
    //查出某个指定员工信息
    @RequestMapping(value="/getbusscheinfo/{enrollnumber}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getSche(@PathVariable("enrollnumber")String enrollnumber){
		
    	Schedule schedule = scheduleService.getSche(enrollnumber);
		return Msg.success().add("PersonSche", schedule);
	}
    
    //更新员工排班数据
  	@RequestMapping(value="/updatebusSche",method=RequestMethod.PUT)
  	@ResponseBody
  	public Msg saveSche(Schedule schedule){
  		scheduleService.updateSche(schedule);
  		return Msg.success();
  	}
  	
/*  	//查出班种分页查询
    @RequestMapping("/getscheClass")
  	@ResponseBody
  	public Msg getScheClass(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model){
    	PageHelper.startPage(pn,5);
  		List<SetSche> scheClass = setScheService.getScheClass();
  		PageInfo page = new PageInfo(scheClass,5);
		model.addAttribute("pageInfo",page);
  		return Msg.success().add("ScheClass", scheClass);
  	}*/

  	//查出班种
    @RequestMapping("/getscheClass")
	@ResponseBody
	public Msg getScheClass(@RequestParam(value = "page",defaultValue = "1")Integer page,@RequestParam(value = "limit",defaultValue = "5")Integer limit, Model model){
    	PageHelper.startPage(page,limit);
		List<SetSche> scheClass = setScheService.getScheClass();
		PageInfo pnlist = new PageInfo(scheClass,limit);
		return Msg.success().add("ScheClass", pnlist);
	}
    
  //查出某个指定班次
    @RequestMapping(value="/getscheClass/{id}",method=RequestMethod.GET)
	@ResponseBody 
	public Msg getOneClass(@PathVariable("id")Integer id){
		
    	SetSche setSche = setScheService.getClass(id);
		return Msg.success().add("OneClss", setSche);
	}
    
    //更新班种数据
  	@RequestMapping(value="/updateClass",method=RequestMethod.PUT)
  	@ResponseBody
  	public Msg updateScheClass(SetSche setSche){
  		setScheService.updateScheClass(setSche);
  		return Msg.success();
  	}
    
    
    
}
