package com.liyang.sems.service;
import com.liyang.sems.core.Result;
import com.liyang.sems.model.EmploymentInfo;
import com.liyang.sems.model.EmploymentSurvey;
import com.liyang.sems.core.Service;


/**
 * Created by LiYang on 2020/11/16.
 */
public interface EmploymentSurveyService extends Service<EmploymentSurvey> {

    /**
     * 通过userId获得用户就业意向信息
     * @param stuId
     */
    Result getInfoByUserId(Integer stuId);

}
