package com.liyang.sems.dao;

import com.liyang.sems.core.Mapper;
import com.liyang.sems.model.Student;
import com.liyang.sems.model.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.sql.ResultSet;
import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface TeacherMapper extends Mapper<Teacher> {

    @Select("select teacher_id from teacher " +
            "WHERE `name`=#{name} AND " +
            "`password`=#{password};")
    Integer login(@Param("name") String name,
                         @Param("password") String password);

}