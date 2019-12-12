package com.bnuz.kq.dao;

import com.bnuz.kq.bean.Schedule;
import com.bnuz.kq.bean.ScheduleExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ScheduleMapper {
    long countByExample(ScheduleExample example);

    int deleteByExample(ScheduleExample example);

    int deleteByPrimaryKey(String enrollnumber);

    int insert(Schedule record);

    int insertSelective(Schedule record);

    List<Schedule> selectByExample(ScheduleExample example);
    
    

    Schedule selectByPrimaryKey(String enrollnumber);

    int updateByExampleSelective(@Param("record") Schedule record, @Param("example") ScheduleExample example);

    int updateByExample(@Param("record") Schedule record, @Param("example") ScheduleExample example);

    int updateByPrimaryKeySelective(Schedule record);

    int updateByPrimaryKey(Schedule record);
    
    int updateByUserInfo(Schedule record);
    
/*    List<KQinfolist> selectJudgeInfo(ScheduleExample);*/
}