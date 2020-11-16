package com.liyang.sems.service.impl;

import com.liyang.sems.dao.SpecialtyMapper;
import com.liyang.sems.model.Specialty;
import com.liyang.sems.service.SpecialtyService;
import com.liyang.sems.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by LiYang on 2020/11/16.
 */
@Service
@Transactional
public class SpecialtyServiceImpl extends AbstractService<Specialty> implements SpecialtyService {
    @Resource
    private SpecialtyMapper specialtyMapper;

}
