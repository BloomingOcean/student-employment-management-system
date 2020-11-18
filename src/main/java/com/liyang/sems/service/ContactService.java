package com.liyang.sems.service;
import com.liyang.sems.core.Result;
import com.liyang.sems.model.Archives;
import com.liyang.sems.model.Contact;
import com.liyang.sems.core.Service;


/**
 * Created by LiYang on 2020/11/16.
 */
public interface ContactService extends Service<Contact> {

    /**
     * 通过userId获得用户联系
     * @param stuId
     */
    Result getInfoByUserId(Integer stuId);
}
