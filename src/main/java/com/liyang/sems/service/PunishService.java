package com.liyang.sems.service;
import com.liyang.sems.core.Result;
import com.liyang.sems.model.PostgraduateInfo;
import com.liyang.sems.model.Punish;
import com.liyang.sems.core.Service;


/**
 * Created by LiYang on 2020/11/16.
 */
public interface PunishService extends Service<Punish> {

    /**
     * 通过userId获得用户触发信息
     * @param stuId
     */
    Result getInfoByUserId(Integer stuId);
}
