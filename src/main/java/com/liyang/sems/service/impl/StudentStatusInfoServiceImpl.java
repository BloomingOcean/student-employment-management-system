package com.liyang.sems.service.impl;

import com.liyang.sems.core.Result;
import com.liyang.sems.core.ResultGenerator;
import com.liyang.sems.dao.StudentStatusInfoMapper;
import com.liyang.sems.model.StudentStatusInfo;
import com.liyang.sems.service.StudentStatusInfoService;
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
public class StudentStatusInfoServiceImpl extends AbstractService<StudentStatusInfo> implements StudentStatusInfoService {
    @Resource
    private StudentStatusInfoMapper studentStatusInfoMapper;

    /**
     * 获得各个省份人数分布
     * @return 各个省份人数
     */
    public Result getProvinceInfo() {
        ResultGenerator resultGenerator = new ResultGenerator();
        return resultGenerator.genSuccessResult(studentStatusInfoMapper.getProvinceInfo());
    }
}
