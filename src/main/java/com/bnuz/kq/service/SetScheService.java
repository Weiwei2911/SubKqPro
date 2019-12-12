package com.bnuz.kq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnuz.kq.bean.SetSche;
import com.bnuz.kq.dao.SetScheMapper;

@Service
public class SetScheService {
	@Autowired
	private SetScheMapper setScheMapper;

//全部查询
	public List<SetSche> getScheClass() {
		// TODO Auto-generated method stub
		List<SetSche> list = setScheMapper.selectByExample(null);
		return list;
	}
	
	//按班号查询
		public SetSche getClass(Integer id) {
			// TODO Auto-generated method stub
			SetSche scheClass =	setScheMapper.selectByPrimaryKey(id);
			return scheClass;
		}
	
		
		//更新员工方法
		public void updateScheClass(SetSche setSche) {
			// TODO Auto-generated method stub
			setScheMapper.updateByPrimaryKey(setSche);
		}
}
