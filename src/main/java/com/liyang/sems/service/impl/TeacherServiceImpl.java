package com.liyang.sems.service.impl;

import com.liyang.sems.dao.TeacherMapper;
import com.liyang.sems.model.Teacher;
import com.liyang.sems.service.TeacherService;
import com.liyang.sems.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by LiYang on 2020/11/14.
 */
@Service
@Transactional
public class TeacherServiceImpl extends AbstractService<Teacher> implements TeacherService {
    @Resource
    private TeacherMapper teacherMapper;

}
