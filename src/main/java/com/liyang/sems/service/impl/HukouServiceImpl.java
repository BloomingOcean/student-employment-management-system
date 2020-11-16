package com.liyang.sems.service.impl;

import com.liyang.sems.dao.HukouMapper;
import com.liyang.sems.model.Hukou;
import com.liyang.sems.service.HukouService;
import com.liyang.sems.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by LiYang on 2020/11/16.
 */
@Service
@Transactional
public class HukouServiceImpl extends AbstractService<Hukou> implements HukouService {
    @Resource
    private HukouMapper hukouMapper;

}
