package com.liyang.sems.service;
import com.liyang.sems.core.Result;
import com.liyang.sems.model.Student;
import com.liyang.sems.model.Teacher;
import com.liyang.sems.core.Service;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * Created by LiYang on 2020/11/14.
 */
public interface TeacherService extends Service<Teacher> {

    Result changePass(@Param("pass") String pass, @Param("id") Integer stuId);
}
