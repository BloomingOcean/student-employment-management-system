package com.liyang.sems.web;

import com.liyang.sems.core.Result;
import com.liyang.sems.service.UnitDistributedService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by LiYang on 2020/11/16.
 */
@RestController
@RequestMapping("/units")
@CrossOrigin
@Api(tags = "获得各种单位的人数")
public class UnitDistributedController {
    @Resource
    private UnitDistributedService unitDistributedService;

    @ApiOperation(value = "就业意向信息-获得各种单位的人数")
    @RequestMapping(value = "/getunitdistributed", method = RequestMethod.GET)
    public Result getUnitDistributed() {
        return unitDistributedService.getUnitDistributed();
    }

}
