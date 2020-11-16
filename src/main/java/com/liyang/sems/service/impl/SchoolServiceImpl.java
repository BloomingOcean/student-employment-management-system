package com.liyang.sems.service.impl;

import com.liyang.sems.dao.SchoolMapper;
import com.liyang.sems.model.School;
import com.liyang.sems.service.SchoolService;
import com.liyang.sems.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by LiYang on 2020/11/16.
 */
@Service
@Transactional
public class SchoolServiceImpl extends AbstractService<School> implements SchoolService {
    @Resource
    private SchoolMapper schoolMapper;

}
