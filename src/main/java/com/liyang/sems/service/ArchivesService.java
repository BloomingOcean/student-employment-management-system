package com.liyang.sems.service;
import com.liyang.sems.core.Result;
import com.liyang.sems.model.Archives;
import com.liyang.sems.core.Service;
import com.liyang.sems.model.Punish;


/**
 * Created by LiYang on 2020/11/16.
 */
public interface ArchivesService extends Service<Archives> {

    /**
     * 通过userId获得用户档案信息
     * @param stuId
     */
    Result getInfoByUserId(Integer stuId);
}
