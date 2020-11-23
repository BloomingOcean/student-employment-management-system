package com.liyang.sems.service.impl;

import com.liyang.sems.core.Result;
import com.liyang.sems.core.ResultGenerator;
import com.liyang.sems.dao.UnitDistributedMapper;
import com.liyang.sems.service.UnitDistributedService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UnitDistributedServiceImpl implements UnitDistributedService {
    @Resource
    private UnitDistributedMapper unitDistributedMapper;

    /**
     * 获得各种单位的人数
     * @return 各种单位的人数
     */
    public Result getUnitDistributed(){
        return ResultGenerator.genSuccessResult(unitDistributedMapper.getUnitDistributed());
    }
}
