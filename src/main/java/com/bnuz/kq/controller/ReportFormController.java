package com.bnuz.kq.controller;

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

import com.bnuz.kq.bean.Allkqinfo;
import com.bnuz.kq.bean.Department;
import com.bnuz.kq.bean.KqInfolist;
import com.bnuz.kq.bean.Msg;
import com.bnuz.kq.bean.Setdept;
import com.bnuz.kq.bean.WorkMonths;
import com.bnuz.kq.service.DepartmentService;
import com.bnuz.kq.service.KqInfoService;
import com.bnuz.kq.service.SetDepService;
import com.bnuz.kq.service.WorkMonService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class ReportFormController {
	@Autowired
    private WorkMonService workmonService;
	@Autowired
	private KqInfoService  sqinfoService;
	@Autowired
    private DepartmentService departmentService; 
    @Autowired
    private SetDepService setDepService;
    @Autowired
    private  KqInfoService kqinfoService;
    
    //指定某个月员工考勤信息
    @RequestMapping(value="/getKqinfobymon/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getMon(@PathVariable("id")Integer id,@RequestParam(value = "page",defaultValue = "1")Integer page,@RequestParam(value = "limit",defaultValue = "5")Integer limit, Model model){
    	PageHelper.startPage(page,limit);
    	WorkMonths workmon = workmonService.getWorkMon(id);
        List<Allkqinfo> kqinfo = sqinfoService.getallkqinfo2();
        List<Allkqinfo> monkqinfo = new ArrayList<Allkqinfo>();
        String temp2[]=workmon.getStartday().split("-");
        String temp3[]=workmon.getEndday().split("-");       
        for(int i =0;i<kqinfo.size();i++){
        	String temp[]=kqinfo.get(i).getTime().split("-| ");
        	 System.out.println(kqinfo.get(i).getTime());
        		 if(temp2[0].equals(temp[1]) && Integer.valueOf(temp2[1]) <= Integer.valueOf(temp[2])){
        			 monkqinfo.add(kqinfo.get(i));
        		 }
        		 if(temp3[0].equals(temp[1]) && Integer.valueOf(temp3[1]) >= Integer.valueOf(temp[2])){
        			 monkqinfo.add(kqinfo.get(i));
        		 }        
        }
        PageInfo pnlist = new PageInfo(monkqinfo,limit);
        return Msg.success().add("getmonkq",pnlist);    	   	
		
	}
    
    
    //指定某个月某个员工考勤信息
    @RequestMapping(value="/getKqinfobymon/{id}/{id2}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getoneMon(@PathVariable("id")Integer id,@PathVariable("id2")Integer id2,@RequestParam(value = "page",defaultValue = "1")Integer page,@RequestParam(value = "limit",defaultValue = "5")Integer limit, Model model){
    	PageHelper.startPage(page,limit);
    	WorkMonths workmon = workmonService.getWorkMon(id);
        List<Allkqinfo> kqinfo = sqinfoService.getallkqinfo2();
        List<Allkqinfo> monkqinfo = new ArrayList<Allkqinfo>();
        List<Allkqinfo> onemonkqinfo = new ArrayList<Allkqinfo>();
        String temp2[]=workmon.getStartday().split("-");
        String temp3[]=workmon.getEndday().split("-");       
        for(int i =0;i<kqinfo.size();i++){
        	String temp[]=kqinfo.get(i).getTime().split("-| ");
        		 if(temp2[0].equals(temp[1]) && Integer.valueOf(temp2[1]) <= Integer.valueOf(temp[2])){
        			 monkqinfo.add(kqinfo.get(i));
        		 }
        		 if(temp3[0].equals(temp[1]) && Integer.valueOf(temp3[1]) >= Integer.valueOf(temp[2])){
        			 monkqinfo.add(kqinfo.get(i));
        		 }        
        }
        for(int i =0;i<monkqinfo.size();i++){
        	if(monkqinfo.get(i).getEnrollnumber().equals(String.valueOf(id2))){
        		onemonkqinfo.add(monkqinfo.get(i));
        		System.out.println(onemonkqinfo);
        	}
        	
        }
        PageInfo pnlist = new PageInfo(monkqinfo,limit);
        return Msg.success().add("getonemonkq",pnlist);    	   	
		
	}
    
    //指定某个部门历史考勤信息
    @RequestMapping(value="/getdepallkqinfo/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getDepallkq(@PathVariable("id")Integer id,@RequestParam(value = "page",defaultValue = "1")Integer page,@RequestParam(value = "limit",defaultValue = "5")Integer limit, Model model){
    	PageHelper.startPage(page,limit);
		Department department = departmentService.getonedep(id);
		List<Allkqinfo> kqinfo = sqinfoService.getallkqinfo2();
		List<Setdept> list = setDepService.getDepUsers();
		List<Setdept> list2 = new ArrayList<Setdept>();
		List<Allkqinfo> depkqlist = new ArrayList<Allkqinfo>();
		for(int i=0;i<list.size();i++){
			if(list.get(i).getDeptId() == department.getDeptId()){
				list2.add(list.get(i));
			}
		}
		for(int i = 0;i<list2.size();i++){
			for(int j = 0;j<kqinfo.size();j++){
				if(list2.get(i).getEnrollnumber().equals(kqinfo.get(j).getEnrollnumber())){
					depkqlist.add(kqinfo.get(j));
				}
			}
			
		}
		PageInfo pnlist = new PageInfo(depkqlist,limit);
		return Msg.success().add("Onedepallkqlist", pnlist);
	}
    
    
    //指定当前某个部门考勤信息
    @RequestMapping(value="/getdepkqlist/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getDeplist(@PathVariable("id")Integer id,@RequestParam(value = "page",defaultValue = "1")Integer page,@RequestParam(value = "limit",defaultValue = "5")Integer limit, Model model){
    	PageHelper.startPage(page,limit);
		Department department = departmentService.getonedep(id);
		List<KqInfolist> kqinfo = sqinfoService.getkqinfo2();
		List<Setdept> list = setDepService.getDepUsers();
		List<Setdept> list2 = new ArrayList<Setdept>();
		List<KqInfolist> depkqlist = new ArrayList<KqInfolist>();
		for(int i=0;i<list.size();i++){
			if(list.get(i).getDeptId() == department.getDeptId()){
				list2.add(list.get(i));
			}
		}
		for(int i = 0;i<list2.size();i++){
			for(int j = 0;j<kqinfo.size();j++){
				if(list2.get(i).getEnrollnumber().equals(kqinfo.get(j).getEnrollnumber())){
					depkqlist.add(kqinfo.get(j));
				}
			}
			
		}
		PageInfo pnlist = new PageInfo(depkqlist,limit);
		return Msg.success().add("Onedepkqlist", pnlist);
	}
    
    
    //所有迟到，早退人员记录   
    @RequestMapping("/getallbadkqinfo")
	@ResponseBody
	public Msg getAllBadKQinfo(@RequestParam(value = "page",defaultValue = "1")Integer page,@RequestParam(value = "limit",defaultValue = "5")Integer limit, Model model){
    	PageHelper.startPage(page,limit);
    	List<Allkqinfo> kqlist = kqinfoService.getallkqinfo2();
    	 List<Allkqinfo> badkqinfo = new ArrayList<Allkqinfo>();
    	 for(int i = 0;i <kqlist.size();i++){
    		 if(kqlist.get(i).getInoutmode().equals("异常打卡")){
    			 badkqinfo.add(kqlist.get(i));
    		 }
    	 }
    	 PageInfo pnlist = new PageInfo(badkqinfo,limit);
    	return Msg.success().add("Badinfo2", pnlist);
}
    
    //指定当前迟到，早退人员考勤信息
    @RequestMapping("/getbadkqinfo")
		@ResponseBody
		public Msg getBadKQinfo(@RequestParam(value = "page",defaultValue = "1")Integer page,@RequestParam(value = "limit",defaultValue = "5")Integer limit, Model model){
    	PageHelper.startPage(page,limit);
	   List<KqInfolist> kqlist = kqinfoService.getkqinfo2();
	   List<KqInfolist> badkqinfo = new ArrayList<KqInfolist>();
       for(int i =0;i<kqlist.size();i++){    	  
    	   if(kqlist.get(i).getInoutmode().equals("异常打卡")){
    		   badkqinfo.add(kqlist.get(i));
    	   }
       }	 
       PageInfo pnlist = new PageInfo(badkqinfo,limit);
	    return  Msg.success().add("Badinfo", pnlist);
    }
    
}
