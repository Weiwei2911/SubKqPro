package com.bnuz.kq.dao;

import com.bnuz.kq.bean.Setdept;
import com.bnuz.kq.bean.SetdeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetdeptMapper {
    long countByExample(SetdeptExample example);

    int deleteByExample(SetdeptExample example);

    int deleteByPrimaryKey(String enrollnumber);

    int insert(Setdept record);

    int insertSelective(Setdept record);

    List<Setdept> selectByExample(SetdeptExample example);

    Setdept selectByPrimaryKey(String enrollnumber);

    int updateByExampleSelective(@Param("record") Setdept record, @Param("example") SetdeptExample example);

    int updateByExample(@Param("record") Setdept record, @Param("example") SetdeptExample example);

    int updateByPrimaryKeySelective(Setdept record);

    int updateByPrimaryKey(Setdept record);
}