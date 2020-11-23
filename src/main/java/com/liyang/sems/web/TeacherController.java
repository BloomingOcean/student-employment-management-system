package com.liyang.sems.web;
import com.liyang.sems.core.Result;
import com.liyang.sems.core.ResultGenerator;
import com.liyang.sems.model.Student;
import com.liyang.sems.model.Teacher;
import com.liyang.sems.service.TeacherService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by LiYang on 2020/11/14.
*/
@RestController
@RequestMapping("/teacher")
@CrossOrigin
@Api(tags = "老师基础信息管理")
public class TeacherController {
    @Resource
    private TeacherService teacherService;

    @ApiOperation(value = "老师基础信息-添加")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Result add(@RequestBody Teacher teacher) {
//        teacherService.save(teacher);
        return teacherService.saveTea(teacher);
    }

    @ApiOperation(value = "老师基础信息-根据id删除")
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public Result delete(@RequestParam Integer id) {
        teacherService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "老师基础信息-根据id更新")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Result update(Teacher teacher) {
        teacherService.update(teacher);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "老师基础信息-根据id查询")
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public Result detail(@RequestParam Integer id) {
        Teacher teacher = teacherService.findById(id);
        return ResultGenerator.genSuccessResult(teacher);
    }

    @ApiOperation(value = "老师基础信息-分页查询")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Teacher> list = teacherService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @ApiOperation(value = "老师基础信息-修改教师密码")
    @RequestMapping(value = "/changepass", method = RequestMethod.PUT)
    public Result changePass(@RequestParam("password")String password, @RequestParam("id")Integer id) {
        return teacherService.changePass(password, id);
    }

}
