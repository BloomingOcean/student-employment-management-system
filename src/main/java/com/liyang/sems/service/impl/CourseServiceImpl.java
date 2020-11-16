package com.liyang.sems.service.impl;

import com.liyang.sems.dao.CourseMapper;
import com.liyang.sems.model.Course;
import com.liyang.sems.service.CourseService;
import com.liyang.sems.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by LiYang on 2020/11/16.
 */
@Service
@Transactional
public class CourseServiceImpl extends AbstractService<Course> implements CourseService {
    @Resource
    private CourseMapper courseMapper;

}
