package com.liyang.sems.dao;

import com.liyang.sems.core.Mapper;
import com.liyang.sems.model.Student;
import com.liyang.sems.model.Teacher;
import org.apache.ibatis.annotations.*;
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

    /**
     * 修改教师密码
     * @param pass 新密码
     * @param teaId 教师id
     * @return 是否成功
     */
    @Update("UPDATE teacher SET `password` = #{pass} WHERE teacher_id = #{id};")
    Boolean changePass(@Param("pass") String pass, @Param("id") Integer teaId);
}