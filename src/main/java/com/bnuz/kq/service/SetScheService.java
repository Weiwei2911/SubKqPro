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

//ȫ����ѯ
	public List<SetSche> getScheClass() {
		// TODO Auto-generated method stub
		List<SetSche> list = setScheMapper.selectByExample(null);
		return list;
	}
	
	//����Ų�ѯ
		public SetSche getClass(Integer id) {
			// TODO Auto-generated method stub
			SetSche scheClass =	setScheMapper.selectByPrimaryKey(id);
			return scheClass;
		}
	
		
		//����Ա������
		public void updateScheClass(SetSche setSche) {
			// TODO Auto-generated method stub
			setScheMapper.updateByPrimaryKey(setSche);
		}
}
