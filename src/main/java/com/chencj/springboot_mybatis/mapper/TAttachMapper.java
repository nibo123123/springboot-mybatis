package com.chencj.springboot_mybatis.mapper;

import com.chencj.springboot_mybatis.entity.TAttach;
import com.chencj.springboot_mybatis.entity.TAttachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAttachMapper {
    int countByExample(TAttachExample example);

    int deleteByExample(TAttachExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAttach record);

    int insertSelective(TAttach record);

    List<TAttach> selectByExample(TAttachExample example);

    TAttach selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAttach record, @Param("example") TAttachExample example);

    int updateByExample(@Param("record") TAttach record, @Param("example") TAttachExample example);

    int updateByPrimaryKeySelective(TAttach record);

    int updateByPrimaryKey(TAttach record);
}