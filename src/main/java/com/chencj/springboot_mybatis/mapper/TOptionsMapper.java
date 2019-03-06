package com.chencj.springboot_mybatis.mapper;

import com.chencj.springboot_mybatis.entity.TOptions;
import com.chencj.springboot_mybatis.entity.TOptionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOptionsMapper {
    int countByExample(TOptionsExample example);

    int deleteByExample(TOptionsExample example);

    int deleteByPrimaryKey(String name);

    int insert(TOptions record);

    int insertSelective(TOptions record);

    List<TOptions> selectByExample(TOptionsExample example);

    TOptions selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") TOptions record, @Param("example") TOptionsExample example);

    int updateByExample(@Param("record") TOptions record, @Param("example") TOptionsExample example);

    int updateByPrimaryKeySelective(TOptions record);

    int updateByPrimaryKey(TOptions record);
}