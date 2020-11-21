package com.liyang.sems.dao;

import com.liyang.sems.core.Mapper;
import com.liyang.sems.model.Province;
import com.liyang.sems.model.Student;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface StudentMapper extends Mapper<Student> {

    @Results(id = "student", value = {
            @Result(column = "stu_id", property = "stuId", jdbcType = JdbcType.INTEGER),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "gender", property = "gender", jdbcType = JdbcType.VARCHAR),
            @Result(column = "nation", property = "nation", jdbcType = JdbcType.VARCHAR),
//            @Result(column = "birthday", property = "birthday", jdbcType = JdbcType.DATE),
            @Result(column = "birthday", property = "birthday", jdbcType = JdbcType.VARCHAR),
            @Result(column = "political_status", property = "politicalStatus", jdbcType = JdbcType.VARCHAR),
            @Result(column = "id_number", property = "idNumber", jdbcType = JdbcType.VARCHAR),
            @Result(column = "only_child", property = "onlyChild", jdbcType = JdbcType.VARCHAR),
            @Result(column = "phone_number", property = "phoneNumber", jdbcType = JdbcType.VARCHAR),
            @Result(column = "email", property = "email", jdbcType = JdbcType.VARCHAR),
            @Result(column = "qq_number", property = "qqNumber", jdbcType = JdbcType.VARCHAR),
            @Result(column = "counselor_id", property = "counselorId", jdbcType = JdbcType.INTEGER),
            @Result(column = "student_status_id", property = "studentStatusId", jdbcType = JdbcType.INTEGER),
            @Result(column = "hukou_id", property = "hukouId", jdbcType = JdbcType.INTEGER),
            @Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
            @Result(column = "class_bj_id", property = "classBjId", jdbcType = JdbcType.INTEGER),
            @Result(column = "course_id", property = "courseId", jdbcType = JdbcType.INTEGER)
    })

    /**
     * 实现用户的登录功能
     */
    @Select("select stu_id from student " +
            "WHERE `name`=#{name} AND " +
            "`password`=#{password};")
    Integer login(@Param("name") String name,
                         @Param("password") String password);

    /**
     * 获取同一个班上的同学
     * @param classId 班级id
     * @return 一个班级的所有同学
     */
//    @ResultMap(value = "student")
//    @Select("SELECT * FROM student " +
//            "WHERE class_bj_id=#{classId}")
    List<Student> getClassmate(@Param("classId") Integer classId);

    /**
     * 修改学生密码
     * @param pass 新密码
     * @param stuId 学生id
     * @return 是否成功
     */
    @Update("UPDATE student SET `password` = #{pass} WHERE stu_id = #{id};")
    Boolean changePass(@Param("pass") String pass, @Param("id") Integer stuId);

    /**
     * 学生中女生数量
     * @return 女生数量
     */
    @Select("SELECT COUNT(*) FROM student " +
            "WHERE gender='女'")
    Integer girlNumber();

    /**
     * 学生中男生数量
     * @return 男生数量
     */
    @Select("SELECT COUNT(*) FROM student " +
            "WHERE gender='男'")
    Integer boyNumber();

    /**
     * 获取各个期望薪资水平的人数
     * @return 各个水平的人数
     */
    @Select("select COUNT(*) from employment_survey where graduate_expected_salary between 0000 and 4000;")
    Integer getExpectedSalary0_4();
    @Select("select COUNT(*) from employment_survey where graduate_expected_salary between 4000 and 8000;")
    Integer getExpectedSalary4_8();
    @Select("select COUNT(*) from employment_survey where graduate_expected_salary between 8000 and 12000;")
    Integer getExpectedSalary8_12();
    @Select("select COUNT(*) from employment_survey where graduate_expected_salary between 12000 and 16000;")
    Integer getExpectedSalary12_16();
    @Select("select COUNT(*) from employment_survey where graduate_expected_salary between 16000 and 20000;")
    Integer getExpectedSalary16_20();

}