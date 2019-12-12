package com.bnuz.kq.dao;

import com.bnuz.kq.bean.KqInfolist;
import com.bnuz.kq.bean.KqInfolistExample;
import com.bnuz.kq.bean.UserInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface KqInfolistMapper {
    long countByExample(KqInfolistExample example);

    int deleteByExample(KqInfolistExample example);

    int deleteByPrimaryKey(String enrollnumber);

    int insert(KqInfolist record);

    int insertSelective(KqInfolist record);

    List<KqInfolist> selectByExample(KqInfolistExample example);
    
    List<KqInfolist> selectByExample2(KqInfolistExample example);

    KqInfolist selectByPrimaryKey(String enrollnumber);

    int updateByExampleSelective(@Param("record") KqInfolist record, @Param("example") KqInfolistExample example);

    int updateByExample(@Param("record") KqInfolist record, @Param("example") KqInfolistExample example);

    int updateByPrimaryKeySelective(KqInfolist record);

    int updateByPrimaryKey(KqInfolist record);
    
    int insertKqInfolist(@Param("kqInfolist")List<KqInfolist> kqInfolist);
}