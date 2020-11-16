package com.liyang.sems.service.impl;

import com.liyang.sems.dao.PostgraduateInfoMapper;
import com.liyang.sems.model.PostgraduateInfo;
import com.liyang.sems.service.PostgraduateInfoService;
import com.liyang.sems.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by LiYang on 2020/11/16.
 */
@Service
@Transactional
public class PostgraduateInfoServiceImpl extends AbstractService<PostgraduateInfo> implements PostgraduateInfoService {
    @Resource
    private PostgraduateInfoMapper postgraduateInfoMapper;

}
