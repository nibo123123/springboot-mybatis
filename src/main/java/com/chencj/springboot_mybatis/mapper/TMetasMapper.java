package com.chencj.springboot_mybatis.mapper;

import com.chencj.springboot_mybatis.entity.TMetas;
import com.chencj.springboot_mybatis.entity.TMetasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMetasMapper {
    int countByExample(TMetasExample example);

    int deleteByExample(TMetasExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(TMetas record);

    int insertSelective(TMetas record);

    List<TMetas> selectByExample(TMetasExample example);

    TMetas selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") TMetas record, @Param("example") TMetasExample example);

    int updateByExample(@Param("record") TMetas record, @Param("example") TMetasExample example);

    int updateByPrimaryKeySelective(TMetas record);

    int updateByPrimaryKey(TMetas record);
}