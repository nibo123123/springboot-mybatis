package com.chencj.springboot_mybatis.mapper;

import com.chencj.springboot_mybatis.entity.TAttach;
import com.chencj.springboot_mybatis.entity.TAttachExample;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface TAttachMapper2 {
   

	@Delete(value="delete from t_attach where id = #{id}")
    int deleteByPrimaryKey(Integer id);

	@Insert("insert  into t_attach (id,fname,ftype,fkey,authorId,created) values (#{id},#{fname},#{ftype},#{fkey},#{authorId},#{created})")
    int insert(TAttach record);
/**
 * private Integer id;

    private String fname;

    private String ftype;

    private String fkey;

    private Integer authorId;

    private Integer created;
 * 
 */

	@Select("select * from t_attach")
    List<TAttach> selectAll();

	@Select("select * from t_attach where id = #{id}")
    TAttach selectByPrimaryKey(Integer id);


	@Options(useGeneratedKeys=true,keyProperty="id")
	@Update("update t_attach set fname=#{fname},ftype=#{ftype},fkey=#{fkey},authorId=#{authorId},created=#{created} where id = #{id}")
    int updateByPrimaryKey(TAttach record);
}