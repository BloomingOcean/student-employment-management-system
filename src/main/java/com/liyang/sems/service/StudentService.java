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
}
