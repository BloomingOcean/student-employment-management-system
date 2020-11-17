package com.liyang.sems.service;

/**
 * Created by LiYang on 2020/11/17.
 */
public interface LoginService {

    /**
     * 实现用户登录功能
     */
    public Integer login(Integer judge, String name, String password);
}
