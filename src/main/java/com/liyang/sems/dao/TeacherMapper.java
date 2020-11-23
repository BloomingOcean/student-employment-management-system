package com.liyang.sems.dao;

import com.liyang.sems.core.Mapper;
import com.liyang.sems.model.Student;
import com.liyang.sems.model.Teacher;
import org.apache.ibatis.annotations.*;

@org.apache.ibatis.annotations.Mapper
public interface TeacherMapper extends Mapper<Teacher> {

    /**
     * 添加老师
     * @param teacher 老师实体
     */
    @Select("INSERT INTO teacher " +
            "VALUES (#{teacherId},#{name},#{jobNumber},#{gender}," +
            "#{nation},#{birthDate},#{politicalStatus},#{idNumber}," +
            "#{teacherGrade},#{address},#{phoneNumber},#{email}," +
            "#{qqNumber},#{courseId},#{password})")
    void saveTea(Teacher teacher);

    /**
     * 实现老师的登录功能
     * @param name 名字
     * @param password 密码
     * @return teaId
     */
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

    /**
     * 获得姓名为name的老师的数量
     * @return 姓名为name的老师的数量
     */
    @Select("SELECT count(*) FROM teacher " +
            "WHERE `name`=#{name};")
    Integer judgmentRepeat(@Param("name") String name);
}