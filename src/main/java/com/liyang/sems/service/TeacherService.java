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

    /**
     * 插入老师信息
     * @param teacher 老师
     */
    Result saveTea(Teacher teacher);

    /**
     * 修改老师密码
     * @param pass 新密码
     * @param teaId 学生id
     * @return 是否成功
     */
    Result changePass(String pass, Integer teaId);
}
