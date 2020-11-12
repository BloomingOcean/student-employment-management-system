package com.liyang.sems.service.impl;

import com.liyang.sems.dao.StudentMapper;
import com.liyang.sems.model.Student;
import com.liyang.sems.service.StudentService;
import com.liyang.sems.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by LiYang on 2020/11/12.
 */
@Service
@Transactional
public class StudentServiceImpl extends AbstractService<Student> implements StudentService {
    @Resource
    private StudentMapper studentMapper;

}
