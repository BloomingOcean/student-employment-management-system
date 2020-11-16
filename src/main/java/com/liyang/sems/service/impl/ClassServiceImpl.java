package com.liyang.sems.service.impl;

import com.liyang.sems.dao.ClassMapper;
import com.liyang.sems.model.ClassBj;
import com.liyang.sems.service.ClassService;
import com.liyang.sems.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by LiYang on 2020/11/16.
 */
@Service
@Transactional
public class ClassServiceImpl extends AbstractService<ClassBj> implements ClassService {
    @Resource
    private ClassMapper classMapper;

}
