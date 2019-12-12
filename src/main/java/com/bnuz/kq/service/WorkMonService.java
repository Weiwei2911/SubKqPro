package com.bnuz.kq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnuz.kq.bean.Employee;
import com.bnuz.kq.bean.SetSche;
import com.bnuz.kq.bean.WorkMonths;
import com.bnuz.kq.dao.WorkMonthsMapper;

@Service
public class WorkMonService {
    @Autowired
    private WorkMonthsMapper workmonthsMapper;
          
    public List<WorkMonths> getAll() {
		// TODO Auto-generated method stub
		return workmonthsMapper.selectByExample(null);
	}


	//按月id查询
	public WorkMonths getWorkMon(Integer id) {
		// TODO Auto-generated method stub
		WorkMonths workmonth =	workmonthsMapper.selectByPrimaryKey(id);
		return workmonth;
	}
	
	//更工作月方法
			public void updateWorkMon(WorkMonths workmonth) {
				// TODO Auto-generated method stub
				workmonthsMapper.updateByPrimaryKey(workmonth);
			}
	
}
