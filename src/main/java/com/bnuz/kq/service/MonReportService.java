package com.bnuz.kq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnuz.kq.bean.MonReport;
import com.bnuz.kq.bean.Schedule;
import com.bnuz.kq.dao.MonReportMapper;


@Service
public class MonReportService {
     @Autowired
     private MonReportMapper monReportMapper;
     
     //��userinfo�е��û����뵽report��
     public void addAlluser() {
			// TODO Auto-generated method stub
    	 monReportMapper.insertbyuseinfo(null);
		}
     
     public void updateAllReport(List<MonReport> monReport){
    	 monReportMapper.updateReport(monReport);
     }
     
     public List<MonReport> getMonReport() {
 		// TODO Auto-generated method stub
 		List<MonReport> list = monReportMapper.selectByExample(null);
 		return list;
 	} 
}
