package com.liyang.sems.service;
import com.liyang.sems.core.Result;
import com.liyang.sems.model.Contact;
import com.liyang.sems.model.EmploymentInfo;
import com.liyang.sems.core.Service;


/**
 * Created by LiYang on 2020/11/16.
 */
public interface EmploymentInfoService extends Service<EmploymentInfo> {

    /**
     * 通过userId获得用户就业信息
     * @param stuId
     */
    Result getInfoByUserId(Integer stuId);

    /**
     * 获取已就业人数和未就业人数
     * @return 已就业人数
     */
    Result getEmploymentNumber();
}
