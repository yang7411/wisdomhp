package com.audaque.sunt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.audaque.sunt.bean.EventClassNewModel;

@Mapper
public interface EventClassNewMapper {
	
    @Results({
        @Result(property = "nodeId",column = "node_id" , javaType = String.class),
        @Result(property = "nodeName",column = "node_name", javaType = String.class),
        @Result(property = "smallCode",column = "small_code", javaType = String.class),
        @Result(property = "memo",column = "memo", javaType = String.class),
        @Result(property = "pid",column = "pid", javaType = String.class),
        @Result(property = "child",column = "child", javaType = Integer.class),
        @Result(property = "maxDealTime",column = "max_deal_time", javaType = Integer.class),
        @Result(property = "minDealTime",column = "min_deal_time", javaType = Integer.class),
        @Result(property = "unit",column = "unit", javaType = String.class),
        @Result(property = "firstDep",column = "first_dep", javaType = String.class),
        @Result(property = "secondDep",column = "second_dep", javaType = String.class),
        @Result(property = "thirdDep",column = "third_dep", javaType = String.class),
        @Result(property = "createdate",column = "create_date", javaType = String.class),
        @Result(property = "del",column = "del", javaType = Integer.class)
    })
    @Select("select * from ia_event_class_new")
    List<EventClassNewModel> getEventClassAll();
    
    @Results({
        @Result(property = "nodeId",column = "node_id" , javaType = String.class),
        @Result(property = "nodeName",column = "node_name", javaType = String.class),
        @Result(property = "smallCode",column = "small_code", javaType = String.class),
        @Result(property = "memo",column = "memo", javaType = String.class),
        @Result(property = "pid",column = "pid", javaType = String.class),
        @Result(property = "child",column = "child", javaType = Integer.class),
        @Result(property = "maxDealTime",column = "max_deal_time", javaType = Integer.class),
        @Result(property = "minDealTime",column = "min_deal_time", javaType = Integer.class),
        @Result(property = "unit",column = "unit", javaType = String.class),
        @Result(property = "firstDep",column = "first_dep", javaType = String.class),
        @Result(property = "secondDep",column = "second_dep", javaType = String.class),
        @Result(property = "thirdDep",column = "third_dep", javaType = String.class),
        @Result(property = "createdate",column = "create_date", javaType = String.class),
        @Result(property = "del",column = "del", javaType = Integer.class)
    })
    @Select("select * from ia_event_class_new where pid = #{pid}")
    List<EventClassNewModel> getEventClass(@Param("pid") String pid);
}
