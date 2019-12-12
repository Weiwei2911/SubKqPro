package com.bnuz.kq.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.commons.collections.MapUtils;
import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bnuz.kq.bean.Allkqdata;
import com.bnuz.kq.bean.LogData;
import com.bnuz.kq.bean.Msg;
import com.bnuz.kq.bean.Schedule;
import com.bnuz.kq.bean.UserInfo;
import com.bnuz.kq.service.MachineService;
import com.bnuz.kq.utils.ZkemSDKUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jacob.activeX.ActiveXComponent;

@Controller
public class MacController {
	
	
	
	@Autowired
	MachineService machineService;
	
	@RequestMapping("/insertallkqinfo")
	@ResponseBody
	//代表请求的request对象、和代表响应的response对象。
	public Msg getkqlist() {
		boolean  connFlag = ZkemSDKUtils.connect("172.31.44.5", 4370);
	    if(connFlag){
	        List<Allkqdata> logDateList = new ArrayList<Allkqdata>();
	        List<Map<String, Object>> generalLogDataAll = ZkemSDKUtils.getGeneralLogData();
	        
	        System.out.println("==============1111");
	        System.out.println(generalLogDataAll.size());        
	        logDateList = ZkemSDKUtils.convertMaps2List(generalLogDataAll);
	        
	        	System.out.println(logDateList.toString());
	        	machineService.addAllkqlist(logDateList);
				return Msg.success();

	    }else{
	    	return Msg.fail();
	    }
	    
	}
}

