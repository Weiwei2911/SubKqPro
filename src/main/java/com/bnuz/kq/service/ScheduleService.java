package com.bnuz.kq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnuz.kq.bean.Employee;
import com.bnuz.kq.bean.Schedule;
import com.bnuz.kq.bean.UserInfo;
import com.bnuz.kq.dao.ScheduleMapper;

@Service
public class ScheduleService {
  
	@Autowired
	private ScheduleMapper scheduleMapper;

//全部查询
	public List<Schedule> getScheduleinfo() {
		// TODO Auto-generated method stub
		List<Schedule> list = scheduleMapper.selectByExample(null);
		return list;
	}
	
	
	
	//按照员工工号查询
		public Schedule getSche(String enrollnumber) {
			// TODO Auto-generated method stub
			Schedule schedule =	scheduleMapper.selectByPrimaryKey(enrollnumber);
			return schedule;
		}
	
		
		//更新员工方法
		public void updateSche(Schedule schedule) {
			// TODO Auto-generated method stub
			scheduleMapper.updateByPrimaryKey(schedule);
		}
}
