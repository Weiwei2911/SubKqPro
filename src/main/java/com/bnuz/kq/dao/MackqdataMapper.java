package com.bnuz.kq.dao;

import com.bnuz.kq.bean.Mackqdata;
import com.bnuz.kq.bean.MackqdataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MackqdataMapper {
    long countByExample(MackqdataExample example);

    int deleteByExample(MackqdataExample example);

    int deleteByPrimaryKey(Integer dataId);

    int insert(Mackqdata record);

    int insertSelective(Mackqdata record);

    List<Mackqdata> selectByExample(MackqdataExample example);

    Mackqdata selectByPrimaryKey(Integer dataId);

    int updateByExampleSelective(@Param("record") Mackqdata record, @Param("example") MackqdataExample example);

    int updateByExample(@Param("record") Mackqdata record, @Param("example") MackqdataExample example);

    int updateByPrimaryKeySelective(Mackqdata record);

    int updateByPrimaryKey(Mackqdata record);
}