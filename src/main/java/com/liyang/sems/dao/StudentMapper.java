package com.liyang.sems.dao;

import com.liyang.sems.core.Mapper;
import com.liyang.sems.model.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@org.apache.ibatis.annotations.Mapper
public interface StudentMapper extends Mapper<Student> {

    @Select("select stu_id from student " +
            "WHERE `name`=#{name} AND " +
            "`password`=#{password};")
    public Integer login(@Param("name") String name,
                         @Param("password") String password);
}