package com.bnuz.kq.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bnuz.kq.bean.Allkqinfo;
import com.bnuz.kq.bean.MonReport;
import com.bnuz.kq.bean.Msg;
import com.bnuz.kq.bean.UserInfo;
import com.bnuz.kq.bean.WorkMonths;
import com.bnuz.kq.service.KqInfoService;
import com.bnuz.kq.service.MonReportService;
import com.bnuz.kq.service.WorkMonService;

@Controller
public class Mon_ReportController {
	@Autowired
    private WorkMonService workmonService;
	@Autowired
	private KqInfoService  sqinfoService;
	@Autowired
	private MonReportService monReportService;
	
	//指定某个月员工考勤信息
    @RequestMapping(value="/getReportbymon/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getReportbyMon(@PathVariable("id")Integer id){
		
    	WorkMonths workmon = workmonService.getWorkMon(id);
        System.out.println(workmon.getStartday());
        System.out.println(workmon.getEndday());
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
         monReportService.addAlluser();
         
         
        List<MonReport> monreport = monReportService.getMonReport();
        for(int i = 0;i<monreport.size();i++){
        	int badnum = 0;
        	int truenum = 0;
        	for(int j =0;j<monkqinfo.size();j++){
        		if(monreport.get(i).getEnrollnumber().equals(monkqinfo.get(j).getEnrollnumber())&&monkqinfo.get(j).getInoutmode().equals("异常打卡")){
        			badnum++;
        		}
        		if(monreport.get(i).getEnrollnumber().equals(monkqinfo.get(j).getEnrollnumber())&&monkqinfo.get(j).getInoutmode().equals("下班签退")){
        			truenum++;
        		}
        		monreport.get(i).setBadNum(badnum);
        		monreport.get(i).setTrueNum(truenum);
        	}
        }
        monReportService.updateAllReport(monreport);
        
        
        return Msg.success().add("getmonkq",monreport);    	   	
		
	}
    
}
