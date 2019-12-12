package com.bnuz.kq.dao;

import com.bnuz.kq.bean.Allkqdata;
import com.bnuz.kq.bean.Allkqinfo;
import com.bnuz.kq.bean.MonReport;
import com.bnuz.kq.bean.MonReportExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MonReportMapper {
    long countByExample(MonReportExample example);

    int deleteByExample(MonReportExample example);

    int deleteByPrimaryKey(String enrollnumber);

    int insert(MonReport record);

    int insertSelective(MonReport record);
    
    int insertbyuseinfo(MonReport record);

    List<MonReport> selectByExample(MonReportExample example);

    MonReport selectByPrimaryKey(String enrollnumber);

    int updateByExampleSelective(@Param("record") MonReport record, @Param("example") MonReportExample example);

    int updateByExample(@Param("record") MonReport record, @Param("example") MonReportExample example);

    int updateByPrimaryKeySelective(MonReport record);

    int updateByPrimaryKey(MonReport record);
    
    int updateReport(@Param("MonReport")List<MonReport> MonReport);
}