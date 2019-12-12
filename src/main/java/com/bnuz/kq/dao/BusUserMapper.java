package com.bnuz.kq.dao;

import com.bnuz.kq.bean.BusUser;
import com.bnuz.kq.bean.BusUserExample;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

public interface BusUserMapper {
    long countByExample(BusUserExample example);

    int deleteByExample(BusUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(BusUser record);

    int insertSelective(BusUser record);

    List<BusUser> selectByExample(BusUserExample example);

    BusUser selectByPrimaryKey(Integer userId);
    
    BusUser selectByUsername(@Param("username") String username);
    
    Set<String> selectRolesByUsername(@Param("username") String username);
    
    int updateByExampleSelective(@Param("record") BusUser record, @Param("example") BusUserExample example);

    int updateByExample(@Param("record") BusUser record, @Param("example") BusUserExample example);

    int updateByPrimaryKeySelective(BusUser record);

    int updateByPrimaryKey(BusUser record);
}