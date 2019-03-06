package com.chencj.springboot_mybatis.mapper;

import com.chencj.springboot_mybatis.entity.TRelationshipsExample;
import com.chencj.springboot_mybatis.entity.TRelationshipsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRelationshipsMapper {
    int countByExample(TRelationshipsExample example);

    int deleteByExample(TRelationshipsExample example);

    int deleteByPrimaryKey(TRelationshipsKey key);

    int insert(TRelationshipsKey record);

    int insertSelective(TRelationshipsKey record);

    List<TRelationshipsKey> selectByExample(TRelationshipsExample example);

    int updateByExampleSelective(@Param("record") TRelationshipsKey record, @Param("example") TRelationshipsExample example);

    int updateByExample(@Param("record") TRelationshipsKey record, @Param("example") TRelationshipsExample example);
}