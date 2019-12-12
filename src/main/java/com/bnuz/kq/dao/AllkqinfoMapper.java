package com.bnuz.kq.dao;

import com.bnuz.kq.bean.Allkqinfo;
import com.bnuz.kq.bean.AllkqinfoExample;
import com.bnuz.kq.bean.KqInfolist;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AllkqinfoMapper {
    long countByExample(AllkqinfoExample example);

    int deleteByExample(AllkqinfoExample example);

    int deleteByPrimaryKey(Integer infoId);

    int insert(Allkqinfo record);

    int insertSelective(Allkqinfo record);

    List<Allkqinfo> selectByExample(AllkqinfoExample example);
    
    List<Allkqinfo> selectByExampleJudgemode(AllkqinfoExample example);

    Allkqinfo selectByPrimaryKey(Integer infoId);

    int updateByExampleSelective(@Param("record") Allkqinfo record, @Param("example") AllkqinfoExample example);

    int updateByExample(@Param("record") Allkqinfo record, @Param("example") AllkqinfoExample example);

    int updateByPrimaryKeySelective(Allkqinfo record);

    int updateByPrimaryKey(Allkqinfo record);
    
    int insertKqInfoMode(@Param("Allkqinfo")List<Allkqinfo> Allkqinfo);
}