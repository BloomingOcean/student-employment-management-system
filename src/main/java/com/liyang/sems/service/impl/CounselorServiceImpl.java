package com.liyang.sems.service.impl;

import com.liyang.sems.dao.CounselorMapper;
import com.liyang.sems.model.Counselor;
import com.liyang.sems.service.CounselorService;
import com.liyang.sems.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by LiYang on 2020/11/16.
 */
@Service
@Transactional
public class CounselorServiceImpl extends AbstractService<Counselor> implements CounselorService {
    @Resource
    private CounselorMapper counselorMapper;

}
