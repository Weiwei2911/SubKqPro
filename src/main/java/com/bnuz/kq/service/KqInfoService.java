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
	
	//�������Ա����ǰ��������
	public List<KqInfolist> getkqinfo() {
		// TODO Auto-generated method stub
		List<KqInfolist> list = kqInfolistMapper.selectByExample2(null);
		return list;
	}
	
	//�������Ա����ʷ������Ϣ����
	public List<Allkqinfo> getallkqinfo() {
		// TODO Auto-generated method stub
		List<Allkqinfo> list = allkqinfoMapper.selectByExampleJudgemode(null);
		return list;
	}
	
	
	//��infolist�������ݿ���
		public void addList(List<KqInfolist> kqinfolist) {
			// TODO Auto-generated method stub
			kqInfolistMapper.insertKqInfolist(kqinfolist);
		}
		
		//�����п��ڼ�¼�������ݿ�
		public void addAllinfo(List<Allkqinfo> kqinfolist) {
			// TODO Auto-generated method stub
			allkqinfoMapper.insertKqInfoMode(kqinfolist);
		}
		
		//�������Ա����ǰ��������
		public List<KqInfolist> getkqinfo2() {
			// TODO Auto-generated method stub
			List<KqInfolist> list2 = kqInfolistMapper.selectByExample(null);
			return list2;
		}
		
		//�������Ա����ʷ���ڼ�¼
		public List<Allkqinfo> getallkqinfo2() {
			// TODO Auto-generated method stub
			List<Allkqinfo> list = allkqinfoMapper.selectByExample(null);
			return list;
		}
		
		//��������Ա����ʷ���ڼ�¼
		public void updateAllkqinfo(Allkqinfo allkqinfo) {
			// TODO Auto-generated method stub
			allkqinfoMapper.updateByPrimaryKeySelective(allkqinfo);
		}

}
