package com.liyang.sems.service.impl;

import com.liyang.sems.dao.StudentMapper;
import com.liyang.sems.model.Student;
import com.liyang.sems.service.StudentService;
import com.liyang.sems.core.AbstractService;
import io.swagger.models.auth.In;
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
}
