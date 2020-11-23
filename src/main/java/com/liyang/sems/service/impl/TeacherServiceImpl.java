package com.liyang.sems.service.impl;

import com.liyang.sems.core.Result;
import com.liyang.sems.core.ResultGenerator;
import com.liyang.sems.dao.StudentMapper;
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

    @Resource
    private StudentMapper studentMapper;

    /**
     * 插入老师信息
     * @param teacher 老师
     */
    public Result saveTea(Teacher teacher) {
        String teaName = teacher.getName();
        if(studentMapper.judgmentRepeat(teaName) == 0 && teacherMapper.judgmentRepeat(teaName) == 0) {
            teacherMapper.saveTea(teacher);
            return ResultGenerator.genSuccessResult();
        } else {
            return ResultGenerator.genFailResult("用户名重复,请重新输入");
        }
    }

    /**
     * 修改老师密码
     * @param pass 新密码
     * @param teaId 老师id
     * @return 是否成功
     */
    public Result changePass(String pass, Integer teaId) {
        return ResultGenerator.genSuccessResult(teacherMapper.changePass(pass, teaId));
    }
}
