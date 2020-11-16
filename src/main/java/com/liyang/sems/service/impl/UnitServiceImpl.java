package com.liyang.sems.service.impl;

import com.liyang.sems.dao.UnitMapper;
import com.liyang.sems.model.Unit;
import com.liyang.sems.service.UnitService;
import com.liyang.sems.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by LiYang on 2020/11/16.
 */
@Service
@Transactional
public class UnitServiceImpl extends AbstractService<Unit> implements UnitService {
    @Resource
    private UnitMapper unitMapper;

}
