package com.liyang.sems.service.impl;

import com.liyang.sems.core.Result;
import com.liyang.sems.core.ResultGenerator;
import com.liyang.sems.dao.StudentMapper;
import com.liyang.sems.model.Student;
import com.liyang.sems.service.StudentService;
import com.liyang.sems.core.AbstractService;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by LiYang on 2020/11/12.
 */
@Service
@Transactional
public class StudentServiceImpl extends AbstractService<Student> implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    /**
     * 获取同一个班级的所有学生信息
     * @param classId 班级ID
     * @return 同一个班级的所有学生信息
     */
    public List<Student> getClassmate(Integer classId) {
        return studentMapper.getClassmate(classId);
    }

    /**
     * 修改学生密码
     * @param pass 新密码
     * @param stuId 学生id
     * @return 是否成功
     */
    public Result changePass(String pass, Integer stuId) {
        ResultGenerator generator = new ResultGenerator();
        Result result = generator.genSuccessResult(studentMapper.changePass(pass, stuId));
        System.out.println("studentresult"+result);
        return result;
    }
}
