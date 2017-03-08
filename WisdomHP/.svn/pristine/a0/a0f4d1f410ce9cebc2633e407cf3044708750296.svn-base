package com.audaque.sunt.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

@Mapper
public interface EventRequestBlobMapper {

	@Results(
			{
			@Result(property = "multimedia", column = "multimedia", javaType = String.class),
			@Result(property = "filename", column = "filename", javaType = String.class) })
	
	@Insert("insert into ijeventrequestblob values (seq_requestblob.nextval,#{ierid,jdbcType=DOUBLE},#{multimedia,jdbcType=BLOB},#{filename,jdbcType=VARCHAR})")
	void save(@Param("ierid")long ierid, @Param("multimedia") byte[] bytes, @Param("filename")String filename);
}