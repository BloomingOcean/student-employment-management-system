package com.liyang.sems.service;

import com.liyang.sems.core.Result;

/**
 * Created by LiYang on 2020/11/17.
 */
public interface LoginService {

    /**
     * 实现用户登录功能
     */
    Result login(Integer judge, String name, String password);
}
