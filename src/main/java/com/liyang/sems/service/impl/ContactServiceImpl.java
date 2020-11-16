package com.liyang.sems.service.impl;

import com.liyang.sems.dao.ContactMapper;
import com.liyang.sems.model.Contact;
import com.liyang.sems.service.ContactService;
import com.liyang.sems.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by LiYang on 2020/11/16.
 */
@Service
@Transactional
public class ContactServiceImpl extends AbstractService<Contact> implements ContactService {
    @Resource
    private ContactMapper contactMapper;

}
