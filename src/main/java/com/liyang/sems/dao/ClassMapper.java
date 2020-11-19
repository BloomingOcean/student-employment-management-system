package com.liyang.sems.dao;

import com.liyang.sems.core.Mapper;
import com.liyang.sems.model.ClassBj;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface ClassMapper extends Mapper<ClassBj> {

    @Results({
            @Result(column="class_id", property="classId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column="name", property="name", jdbcType = JdbcType.VARCHAR),
    })

    /**
     *
     * @param className
     * @return
     */
    @Select("SELECT class_id FROM class_bj " +
            "WHERE `name`= #{className}")
    Integer getClassmate(@Param("className") String className);
}