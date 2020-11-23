package com.liyang.sems.web;

import com.liyang.sems.core.Result;
import com.liyang.sems.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin
@Api(tags = "用户登录接口")
public class LoginController {
    @Resource
    private LoginService loginService;

    @ApiOperation(value = "用户登录")
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public Result login(@RequestParam("identityStatus")Integer judge,
                        @RequestParam("username")String name,
                        @RequestParam("password")String password) {
        return loginService.login(judge, name, password);
    }
}
