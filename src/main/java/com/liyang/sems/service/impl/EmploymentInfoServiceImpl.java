package com.liyang.sems.service.impl;

import com.liyang.sems.core.Result;
import com.liyang.sems.core.ResultGenerator;
import com.liyang.sems.dao.EmploymentInfoMapper;
import com.liyang.sems.model.EmploymentInfo;
import com.liyang.sems.service.EmploymentInfoService;
import com.liyang.sems.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;


/**
 * Created by LiYang on 2020/11/16.
 */
@Service
@Transactional
public class EmploymentInfoServiceImpl extends AbstractService<EmploymentInfo> implements EmploymentInfoService {
    @Resource
    private EmploymentInfoMapper employmentInfoMapper;

    /**
     * 通过userId获得用户就业信息
     * @param stuId
     */
    public Result getInfoByUserId(Integer stuId){
        return ResultGenerator.genSuccessResult(employmentInfoMapper.getInfoByUserId(stuId));
    }

    /**
     * 获取未就业人数和已就业人数
     * @return 已就业人数
     */
    public Result getEmploymentNumber(){
        HashMap hashMap = new HashMap();
        hashMap.put("unemploymentNumber",employmentInfoMapper.getUnemploymentNumber());
        hashMap.put("employmentNumber",employmentInfoMapper.getEmploymentNumber());
        return ResultGenerator.genSuccessResult(hashMap);
    }
}
