package com.bnuz.kq.dao;

import com.bnuz.kq.bean.Allkqdata;
import com.bnuz.kq.bean.AllkqdataExample;
import com.bnuz.kq.bean.LogData;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AllkqdataMapper {
    long countByExample(AllkqdataExample example);

    int deleteByExample(AllkqdataExample example);

    int deleteByPrimaryKey(Integer kqNum);

    int insert(Allkqdata record);

    int insertSelective(Allkqdata record);

    List<Allkqdata> selectByExample(AllkqdataExample example);

    Allkqdata selectByPrimaryKey(Integer kqNum);

    int updateByExampleSelective(@Param("record") Allkqdata record, @Param("example") AllkqdataExample example);

    int updateByExample(@Param("record") Allkqdata record, @Param("example") AllkqdataExample example);

    int updateByPrimaryKeySelective(Allkqdata record);

    int updateByPrimaryKey(Allkqdata record);
    
    int insertAllkqData(@Param("allkqData")List<Allkqdata> allkqdatalist);
    
    
}