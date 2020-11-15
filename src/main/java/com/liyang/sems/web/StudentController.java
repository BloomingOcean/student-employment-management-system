package com.liyang.sems.web;
import com.liyang.sems.core.Result;
import com.liyang.sems.core.ResultGenerator;
import com.liyang.sems.model.Student;
import com.liyang.sems.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by LiYang on 2020/11/12.
*/
@RestController
@RequestMapping("/student")
@Api(tags = "学生基础信息管理")
public class StudentController {
    @Resource
    private StudentService studentService;

    @ApiOperation(value = "添加一位学生")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Result add(Student student) {
        studentService.save(student);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "根据某位学生的id删除他的信息")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Result delete(@RequestParam Integer id) {
        studentService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "查询出某个学生的基础信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Result update(Student student) {
        studentService.update(student);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "查询出某个学生的基础信息")
    @RequestMapping(value = "/detail", method = RequestMethod.POST)
    public Result detail(@RequestParam Integer id) {
        Student student = studentService.findById(id);
        return ResultGenerator.genSuccessResult(student);
    }

    @ApiOperation(value = "展示出学生的所有基础信息")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Student> list = studentService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
