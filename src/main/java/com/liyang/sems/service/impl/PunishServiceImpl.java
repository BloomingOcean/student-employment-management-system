package com.liyang.sems.service.impl;

import com.liyang.sems.dao.PunishMapper;
import com.liyang.sems.model.Punish;
import com.liyang.sems.service.PunishService;
import com.liyang.sems.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by LiYang on 2020/11/16.
 */
@Service
@Transactional
public class PunishServiceImpl extends AbstractService<Punish> implements PunishService {
    @Resource
    private PunishMapper punishMapper;

}
