package com.bnuz.kq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnuz.kq.bean.Allkqinfo;
import com.bnuz.kq.bean.KqInfolist;
import com.bnuz.kq.bean.WorkMonths;
import com.bnuz.kq.dao.AllkqdataMapper;
import com.bnuz.kq.dao.AllkqinfoMapper;
import com.bnuz.kq.dao.KqInfolistMapper;

@Service
public class KqInfoService {

	@Autowired
	private KqInfolistMapper kqInfolistMapper;
	@Autowired
	private AllkqdataMapper allkqdataMapper;
	@Autowired
	private AllkqinfoMapper allkqinfoMapper;
	
	//查出所有员工当前考勤数据
	public List<KqInfolist> getkqinfo() {
		// TODO Auto-generated method stub
		List<KqInfolist> list = kqInfolistMapper.selectByExample2(null);
		return list;
	}
	
	//查出所有员工历史考勤信息数据
	public List<Allkqinfo> getallkqinfo() {
		// TODO Auto-generated method stub
		List<Allkqinfo> list = allkqinfoMapper.selectByExampleJudgemode(null);
		return list;
	}
	
	
	//将infolist插入数据库中
		public void addList(List<KqInfolist> kqinfolist) {
			// TODO Auto-generated method stub
			kqInfolistMapper.insertKqInfolist(kqinfolist);
		}
		
		//将所有考勤记录插入数据库
		public void addAllinfo(List<Allkqinfo> kqinfolist) {
			// TODO Auto-generated method stub
			allkqinfoMapper.insertKqInfoMode(kqinfolist);
		}
		
		//查出所有员工当前考勤数据
		public List<KqInfolist> getkqinfo2() {
			// TODO Auto-generated method stub
			List<KqInfolist> list2 = kqInfolistMapper.selectByExample(null);
			return list2;
		}
		
		//查出所有员工历史考勤记录
		public List<Allkqinfo> getallkqinfo2() {
			// TODO Auto-generated method stub
			List<Allkqinfo> list = allkqinfoMapper.selectByExample(null);
			return list;
		}
		
		//更新所有员工历史考勤记录
		public void updateAllkqinfo(Allkqinfo allkqinfo) {
			// TODO Auto-generated method stub
			allkqinfoMapper.updateByPrimaryKeySelective(allkqinfo);
		}

}
