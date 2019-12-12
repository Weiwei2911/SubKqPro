package com.bnuz.kq.dao;

import com.bnuz.kq.bean.SetSche;
import com.bnuz.kq.bean.SetScheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetScheMapper {
    long countByExample(SetScheExample example);

    int deleteByExample(SetScheExample example);

    int deleteByPrimaryKey(Integer classid);

    int insert(SetSche record);

    int insertSelective(SetSche record);

    List<SetSche> selectByExample(SetScheExample example);

    SetSche selectByPrimaryKey(Integer classid);

    int updateByExampleSelective(@Param("record") SetSche record, @Param("example") SetScheExample example);

    int updateByExample(@Param("record") SetSche record, @Param("example") SetScheExample example);

    int updateByPrimaryKeySelective(SetSche record);

    int updateByPrimaryKey(SetSche record);
}