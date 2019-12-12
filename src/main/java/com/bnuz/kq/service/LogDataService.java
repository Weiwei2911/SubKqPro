package com.bnuz.kq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnuz.kq.bean.LogData;
import com.bnuz.kq.dao.LogDataMapper;


@Service
public class LogDataService {
     @Autowired
     LogDataMapper logDataMapper;
     
     public List<LogData> getAll() {
 		// TODO Auto-generated method stub
 		return logDataMapper.selectByExample(null);
 	}
	
}
