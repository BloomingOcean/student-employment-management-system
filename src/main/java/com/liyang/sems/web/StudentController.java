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
@CrossOrigin
@Api(tags = "学生信息管理")
public class StudentController {
    @Resource
    private StudentService studentService;

    @ApiOperation(value = "添加")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Result add(@RequestBody Student student) {
        studentService.save(student);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "根据id删除")
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public Result delete(@RequestParam Integer id) {
        studentService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "根据id更新")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Result update(Student student) {
        studentService.update(student);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "根据id查询")
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public Result detail(@RequestParam Integer id) {
        Student student = studentService.findById(id);
        return ResultGenerator.genSuccessResult(student);
    }

    @ApiOperation(value = "分页查询")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Student> list = studentService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @ApiOperation(value = "修改学生密码")
    @RequestMapping(value = "/changepass", method = RequestMethod.PUT)
    public Result changePass(@RequestParam("password")String password, @RequestParam("id")Integer id) {
        return studentService.changePass(password, id);
    }
}
