package com.liyang.sems.service.impl;

import com.liyang.sems.core.Result;
import com.liyang.sems.core.ResultGenerator;
import com.liyang.sems.dao.ArchivesMapper;
import com.liyang.sems.model.Archives;
import com.liyang.sems.service.ArchivesService;
import com.liyang.sems.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by LiYang on 2020/11/16.
 */
@Service
@Transactional
public class ArchivesServiceImpl extends AbstractService<Archives> implements ArchivesService {
    @Resource
    private ArchivesMapper archivesMapper;

    /**
     * 通过userId获得用户档案信息
     * @param stuId
     */
    public Result getInfoByUserId(Integer stuId){
        ResultGenerator resultGenerator = new ResultGenerator();
        return resultGenerator.genSuccessResult(archivesMapper.getInfoByUserId(stuId));
    }

}
