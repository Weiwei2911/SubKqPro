package com.bnuz.kq.dao;

import com.bnuz.kq.bean.UserInfo;
import com.bnuz.kq.bean.WorkMonths;
import com.bnuz.kq.bean.WorkMonthsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface WorkMonthsMapper {
    long countByExample(WorkMonthsExample example);

    int deleteByExample(WorkMonthsExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(WorkMonths record);

    int insertSelective(WorkMonths record);

    List<WorkMonths> selectByExample(WorkMonthsExample example);

    WorkMonths selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") WorkMonths record, @Param("example") WorkMonthsExample example);

    int updateByExample(@Param("record") WorkMonths record, @Param("example") WorkMonthsExample example);

    int updateByPrimaryKeySelective(WorkMonths record);

    int updateByPrimaryKey(WorkMonths record);
    
}