package com.liyang.sems.service.impl;

import com.liyang.sems.core.Result;
import com.liyang.sems.core.ResultGenerator;
import com.liyang.sems.dao.TeacherMapper;
import com.liyang.sems.model.Student;
import com.liyang.sems.model.Teacher;
import com.liyang.sems.service.TeacherService;
import com.liyang.sems.core.AbstractService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by LiYang on 2020/11/14.
 */
@Service
@Transactional
public class TeacherServiceImpl extends AbstractService<Teacher> implements TeacherService {
    @Resource
    private TeacherMapper teacherMapper;

    /**
     * 修改老师密码
     * @param pass 新密码
     * @param stuId 老师id
     * @return 是否成功
     */
    public Result changePass(String pass, Integer stuId) {
        ResultGenerator generator = new ResultGenerator();
        Result result = generator.genSuccessResult(teacherMapper.changePass(pass, stuId));
        System.out.println("teacherresult"+result);
        return result;
    }
}
