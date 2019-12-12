package com.bnuz.kq.dao;

import com.bnuz.kq.bean.Machineinfo;
import com.bnuz.kq.bean.MachineinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MachineinfoMapper {
    long countByExample(MachineinfoExample example);

    int deleteByExample(MachineinfoExample example);

    int deleteByPrimaryKey(Integer macId);

    int insert(Machineinfo record);

    int insertSelective(Machineinfo record);

    List<Machineinfo> selectByExample(MachineinfoExample example);

    Machineinfo selectByPrimaryKey(Integer macId);

    int updateByExampleSelective(@Param("record") Machineinfo record, @Param("example") MachineinfoExample example);

    int updateByExample(@Param("record") Machineinfo record, @Param("example") MachineinfoExample example);

    int updateByPrimaryKeySelective(Machineinfo record);

    int updateByPrimaryKey(Machineinfo record);
}