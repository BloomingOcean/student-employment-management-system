package com.liyang.sems.service;
import com.liyang.sems.core.Result;
import com.liyang.sems.model.Student;
import com.liyang.sems.core.Service;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * Created by LiYang on 2020/11/12.
 */
public interface StudentService extends Service<Student> {

    /**
     * 获取同一个班级的所有学生信息
     * @param classId 班级id
     * @return 同一个班级的所有学生信息
     */
    List<Student> getClassmate(Integer classId);

    Result changePass(@Param("pass") String pass, @Param("id") Integer stuId);

    /**
     * 获取学生中男女生数量
     * @return 男女生数量
     */
    Result getClassGenger();

    /**
     * 获取各个期望薪资水平的人数
     * @return 各个水平的人数
     */
    Result getExpectedSalary();

    /**
     * 获得考研、就业人数
     * @return 考研、就业人数
     */
    Result getPostEmplNumber();
}
