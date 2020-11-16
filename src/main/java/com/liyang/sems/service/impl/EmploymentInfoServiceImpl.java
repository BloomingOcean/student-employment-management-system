package com.liyang.sems.service.impl;

import com.liyang.sems.dao.EmploymentInfoMapper;
import com.liyang.sems.model.EmploymentInfo;
import com.liyang.sems.service.EmploymentInfoService;
import com.liyang.sems.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by LiYang on 2020/11/16.
 */
@Service
@Transactional
public class EmploymentInfoServiceImpl extends AbstractService<EmploymentInfo> implements EmploymentInfoService {
    @Resource
    private EmploymentInfoMapper employmentInfoMapper;

}
