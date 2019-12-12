/*package com.bnuz.kq.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bnuz.kq.bean.LogData;
import com.bnuz.kq.bean.Msg;
import com.bnuz.kq.bean.UserInfo;
import com.bnuz.kq.service.MachineService;
import com.bnuz.kq.utils.ZkemSDKUtils;


@Controller
@RequestMapping(value="/Mac",method=RequestMethod.GET)
public class MachineController {
	@Autowired
	MachineService machineService;
	
	//新增用户
		@RequestMapping(value="/adduser",method=RequestMethod.POST)
		@ResponseBody
		public Msg saveUser(UserInfo userInfo){
			machineService.addUser(userInfo);
			return Msg.success();
		}
		
		//插入所有
		@RequestMapping(value="/addalluser",method=RequestMethod.GET)
		@ResponseBody
		public Msg saveAllUser(@RequestBody List<UserInfo> userInfo){
			System.out.print("***"+userInfo.toString());
			machineService.addAllUser(userInfo);
			return Msg.success();
		}
		
		@RequestMapping(value="/addalluser",method=RequestMethod.GET)
		@ResponseBody
		public Msg saveAlllog(@RequestBody List<LogData> logdata){
			List<LogData> logDateList = new ArrayList<LogData>();
	        //连接考勤机；
	        boolean connect = connect("172.31.44.5", 4370);
	        if(connect){
	            List<Map<String, Object>> generalLogDataAll = ZkemSDKUtils.getGeneralLogData();
	            for (int i = 0; i < generalLogDataAll.size(); i++) {
	                //System.out.println(generalLogDataAll.get(i));
	                String Year =String.valueOf(generalLogDataAll.get(i).get("Year"));
	                String Hour = String.valueOf(generalLogDataAll.get(i).get("Hour"));
	                String InOutMode = String.valueOf(generalLogDataAll.get(i).get("InOutMode"));
	                String Time = String.valueOf(generalLogDataAll.get(i).get("Time"));
	                String Second = String.valueOf(generalLogDataAll.get(i).get("Second"));
	                String Minute = String.valueOf(generalLogDataAll.get(i).get("Minute"));
	                String EnrollNumber = String.valueOf(generalLogDataAll.get(i).get("EnrollNumber"));
	                String Day = String.valueOf(generalLogDataAll.get(i).get("Day"));
	                String Month = String.valueOf(generalLogDataAll.get(i).get("Month"));
	                String VerifyMode = String.valueOf(generalLogDataAll.get(i).get("VerifyMode"));
	                
	                LogData logData = new LogData();
	                logData.setYear(Year);
	                logData.setHour(Hour);
	                logData.setInoutmode(InOutMode);
	                logData.setTime(Time);
	                logData.setSecond(Second);
	                logData.setMinute(Minute);
	                logData.setEnrollnumber(EnrollNumber);
	                logData.setDay(Day);
	                logData.setMonth(Month);
	                logData.setVerifymode(VerifyMode);

	                if (EnrollNumber.equals(userNumber)&&userNumber!=null){
	                    logDateList.add(logData);
	                }else if (userNumber==null){
	                    logDateList.add(logData);
	                }
	            } 
			System.out.print("***"+logdata.toString());
			machineService.addAllloglist(logdata);
			return Msg.success();
		}
		
		
	
}
*/