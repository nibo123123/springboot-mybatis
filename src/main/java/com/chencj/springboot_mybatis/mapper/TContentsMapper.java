package com.chencj.springboot_mybatis.mapper;

import com.chencj.springboot_mybatis.entity.TContents;
import com.chencj.springboot_mybatis.entity.TContentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TContentsMapper {
    int countByExample(TContentsExample example);

    int deleteByExample(TContentsExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(TContents record);

    int insertSelective(TContents record);

    List<TContents> selectByExampleWithBLOBs(TContentsExample example);

    List<TContents> selectByExample(TContentsExample example);

    TContents selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") TContents record, @Param("example") TContentsExample example);

    int updateByExampleWithBLOBs(@Param("record") TContents record, @Param("example") TContentsExample example);

    int updateByExample(@Param("record") TContents record, @Param("example") TContentsExample example);

    int updateByPrimaryKeySelective(TContents record);

    int updateByPrimaryKeyWithBLOBs(TContents record);

    int updateByPrimaryKey(TContents record);
}