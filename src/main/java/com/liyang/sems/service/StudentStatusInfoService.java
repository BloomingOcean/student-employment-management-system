package com.liyang.sems.service;
import com.liyang.sems.core.Result;
import com.liyang.sems.model.Province;
import com.liyang.sems.model.StudentStatusInfo;
import com.liyang.sems.core.Service;

import java.util.List;


/**
 * Created by LiYang on 2020/11/16.
 */
public interface StudentStatusInfoService extends Service<StudentStatusInfo> {

    /**
     * 获得各个省份人数分布
     * @return 各个省份人数
     */
    Result getProvinceInfo();
}
