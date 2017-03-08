package com.audaque.sunt.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.audaque.sunt.bean.EventRequestModel;

@Mapper
public interface EventRequestMapper {

	@Results({ @Result(property = "id", column = "id", javaType = Integer.class),
			@Result(property = "telnumber", column = "telnumber", javaType = String.class),
			@Result(property = "userid", column = "userid", javaType = String.class),
			@Result(property = "addressid", column = "addressid", javaType = String.class),
			@Result(property = "articleid", column = "articleid", javaType = String.class),
			@Result(property = "gridid", column = "gridid", javaType = String.class),
			@Result(property = "eventdescription", column = "eventdescription", javaType = String.class),
			@Result(property = "state", column = "state", javaType = String.class),
			@Result(property = "xcoor", column = "xcoor", javaType = String.class),
			@Result(property = "ycoor", column = "ycoor", javaType = String.class),
			@Result(property = "eventtype", column = "eventtype", javaType = String.class),
			@Result(property = "usercoordx", column = "usercoordx", javaType = String.class),
			@Result(property = "usercoordy", column = "usercoordy", javaType = String.class),
			@Result(property = "smallCode", column = "small_code", javaType = String.class),
			@Result(property = "acceptdatetime", column = "acceptdatetime", javaType = String.class),
			@Result(property = "classidx", column = "classidx", javaType = String.class),
			@Result(property = "ccuser", column = "ccuser", javaType = String.class),
			@Result(property = "phonenumber", column = "phonenumber", javaType = String.class),
			@Result(property = "deptname", column = "deptname", javaType = String.class) })

	@Insert("insert into ijeventrequest values (#{id},#{telnumber,jdbcType=VARCHAR},#{userid,jdbcType=VARCHAR},#{addressid,jdbcType=VARCHAR},#{articleid,jdbcType=VARCHAR},#{gridid,jdbcType=VARCHAR},"
			+ "#{eventdescription,jdbcType=VARCHAR},#{state,jdbcType=VARCHAR},#{xcoor,jdbcType=VARCHAR},#{ycoor,jdbcType=VARCHAR},#{eventtype,jdbcType=VARCHAR},#{usercoordx,jdbcType=VARCHAR},#{usercoordy,jdbcType=VARCHAR},"
			+ "#{smallCode,jdbcType=VARCHAR},#{acceptdatetime,jdbcType=VARCHAR},#{classidx,jdbcType=VARCHAR},#{ccuser,jdbcType=VARCHAR},#{phonenumber,jdbcType=VARCHAR},#{deptname,jdbcType=VARCHAR})")
	void save(EventRequestModel eventRequestModel);

	@Select("select seq_ijeventrequest.nextval as id FROM dual")
	int getSeq();

}