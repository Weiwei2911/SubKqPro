package com.bnuz.kq.dao;

import com.bnuz.kq.bean.LogData;
import com.bnuz.kq.bean.LogDataExample;
import com.bnuz.kq.bean.UserInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface LogDataMapper {
    long countByExample(LogDataExample example);

    int deleteByExample(LogDataExample example);

    int deleteByPrimaryKey(String enrollnumber);

    int insert(LogData record);

    int insertSelective(LogData record);

    List<LogData> selectByExample(LogDataExample example);

    LogData selectByPrimaryKey(String enrollnumber);

    int updateByExampleSelective(@Param("record") LogData record, @Param("example") LogDataExample example);

    int updateByExample(@Param("record") LogData record, @Param("example") LogDataExample example);

    int updateByPrimaryKeySelective(LogData record);

    int updateByPrimaryKey(LogData record);
    
    int insertLogData(@Param("logData")List<LogData> logData);
    
}