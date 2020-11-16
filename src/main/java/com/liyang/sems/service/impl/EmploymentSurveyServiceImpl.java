package com.liyang.sems.service.impl;

import com.liyang.sems.dao.EmploymentSurveyMapper;
import com.liyang.sems.model.EmploymentSurvey;
import com.liyang.sems.service.EmploymentSurveyService;
import com.liyang.sems.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by LiYang on 2020/11/16.
 */
@Service
@Transactional
public class EmploymentSurveyServiceImpl extends AbstractService<EmploymentSurvey> implements EmploymentSurveyService {
    @Resource
    private EmploymentSurveyMapper employmentSurveyMapper;

}
