package com.liyang.sems.web;
import com.liyang.sems.core.Result;
import com.liyang.sems.core.ResultGenerator;
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
@Api(tags = "老师基础信息管理")
public class TeacherController {
    @Resource
    private TeacherService teacherService;

    @ApiOperation(value = "添加")
    @PostMapping("/add")
    public Result add(Teacher teacher) {
        teacherService.save(teacher);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "根据id删除")
    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        teacherService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "根据id更新")
    @PostMapping("/update")
    public Result update(@RequestBody Teacher teacher) {
        teacherService.update(teacher);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "根据id查询")
    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Teacher teacher = teacherService.findById(id);
        return ResultGenerator.genSuccessResult(teacher);
    }

    @ApiOperation(value = "分页查询")
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Teacher> list = teacherService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
