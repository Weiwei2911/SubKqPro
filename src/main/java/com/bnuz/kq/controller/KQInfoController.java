package com.bnuz.kq.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bnuz.kq.bean.Allkqinfo;
import com.bnuz.kq.bean.Employee;
import com.bnuz.kq.bean.KqInfolist;
import com.bnuz.kq.bean.Msg;
import com.bnuz.kq.bean.UserInfo;
import com.bnuz.kq.bean.WorkMonths;
import com.bnuz.kq.service.KqInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;



@Controller
public class KQInfoController {
	@Autowired
    private  KqInfoService kqinfoService;
	

	 
	
	   
	    //某个员工当前考勤状态
	    @RequestMapping("/getkqinfo")
	  		@ResponseBody
	  		public Msg getKQinfo2(@RequestParam(value = "page",defaultValue = "1")Integer page,@RequestParam(value = "limit",defaultValue = "5")Integer limit, Model model){
	    	PageHelper.startPage(page,limit);
	    	List<KqInfolist> kqlist = kqinfoService.getkqinfo();
	    	/*List<KQinfolist> kqlist = new ArrayList<KQinfolist>();*/
			
	    	String setstart;
	    	
			for(int i=0;i<kqlist.size();i++){
				 kqlist.get(i).setInoutmode("异常打卡");
				 if(kqlist.get(i).getStarttime().equals("0")){
					 setstart = "23";
					 if(kqlist.get(i).getHour().equals(setstart)){
						 kqlist.get(i).setInoutmode("上班签到");
					 }
				 }else if(kqlist.get(i).getStarttime().equals(null)){
					 kqlist.get(i).setInoutmode("异常打卡");
				 }else if(kqlist.get(i).getHour().equals(kqlist.get(i).getEndtime())){
					 kqlist.get(i).setInoutmode("下班签退");
				 }
				 else{
					 int t = Integer.valueOf(kqlist.get(i).getStarttime());
					 setstart = String.valueOf(t - 1);
					 if(kqlist.get(i).getHour().equals(setstart)){
						 kqlist.get(i).setInoutmode("上班签到");
					 }
				 }
				 				 				 				 
                       
			 }
			
			kqinfoService.addList(kqlist);
			PageInfo pnlist = new PageInfo(kqlist,limit);
	    	return Msg.success().add("kqinfo2", pnlist);
	    }
	    
	    //所有员工考勤记录状态
	    @RequestMapping("/getallmode")
  		@ResponseBody
  		public Msg getKqMode(@RequestParam(value = "page",defaultValue = "1")Integer page,@RequestParam(value = "limit",defaultValue = "5")Integer limit, Model model){
	    	PageHelper.startPage(page,limit);
    	List<Allkqinfo> kqlist = kqinfoService.getallkqinfo();
    	/*List<KQinfolist> kqlist = new ArrayList<KQinfolist>();*/
		
    	String setstart;
    	
		for(int i=0;i<kqlist.size();i++){
			 kqlist.get(i).setInoutmode("异常打卡");
			 if(kqlist.get(i).getStarttime().equals("0")){
				 setstart = "23";
				 if(kqlist.get(i).getHour().equals(setstart)){
					 kqlist.get(i).setInoutmode("上班签到");
				 }
			 }else if(kqlist.get(i).getStarttime().equals(null)){
				 kqlist.get(i).setInoutmode("异常打卡");
			 }else if(kqlist.get(i).getHour().equals(kqlist.get(i).getEndtime())){
				 kqlist.get(i).setInoutmode("下班签退");
			 }
			 else{
				 int t = Integer.valueOf(kqlist.get(i).getStarttime());
				 setstart = String.valueOf(t - 1);
				 if(kqlist.get(i).getHour().equals(setstart)){
					 kqlist.get(i).setInoutmode("上班签到");
				 }
			 }
			 				 				 				 
                   
		 }
		
		kqinfoService.addAllinfo(kqlist);
		PageInfo pnlist = new PageInfo(kqlist,limit);
    	return Msg.success().add("allkqinfo", pnlist).add("size", kqlist.size());
    }
	    
		
	    //从数据库中拿出取出主键
	    @RequestMapping("/getallmode2")
  		@ResponseBody
  		public Msg getKqMode2(@RequestParam(value = "page",defaultValue = "1")Integer page,@RequestParam(value = "limit",defaultValue = "5")Integer limit, Model model){
	    	PageHelper.startPage(page,limit);
	    	List<Allkqinfo> kqlist = kqinfoService.getallkqinfo2();
	    	PageInfo pnlist = new PageInfo(kqlist,limit);
	    	return Msg.success().add("allkqinfo", pnlist).add("size", kqlist.size());
	    }
	    
	    
	    @RequestMapping("/updatekqinfo")
  		@ResponseBody
  		public Msg updateKqinfo(Allkqinfo allkqinfo){
	    	kqinfoService.updateAllkqinfo(allkqinfo);
	  		return Msg.success();
	  	}
	   


	    
	    
}
