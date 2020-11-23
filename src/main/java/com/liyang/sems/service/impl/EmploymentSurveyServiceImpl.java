package com.liyang.sems.service.impl;

import com.liyang.sems.core.Result;
import com.liyang.sems.core.ResultGenerator;
import com.liyang.sems.dao.EmploymentSurveyMapper;
import com.liyang.sems.model.EmploymentInfo;
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

    /**
     * 通过userId获得用户就业意向信息
     * @param stuId
     */
    public Result getInfoByUserId(Integer stuId){
        return ResultGenerator.genSuccessResult(employmentSurveyMapper.getInfoByUserId(stuId));
    }

}
