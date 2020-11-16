package com.liyang.sems.web;
import com.liyang.sems.core.Result;
import com.liyang.sems.core.ResultGenerator;
import com.liyang.sems.model.StudentStatusInfo;
import com.liyang.sems.service.StudentStatusInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by LiYang on 2020/11/16.
*/
@RestController
@RequestMapping("/studentstatusinfo")
@Api(tags = "学生基础信息管理")
public class StudentStatusInfoController {
    @Resource
    private StudentStatusInfoService studentStatusInfoService;

    @ApiOperation(value = "添加")
    @PostMapping("/add")
    public Result add(@RequestBody StudentStatusInfo studentStatusInfo) {
        studentStatusInfoService.save(studentStatusInfo);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "根据id删除")
    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        studentStatusInfoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "根据id更新")
    @PostMapping("/update")
    public Result update(StudentStatusInfo studentStatusInfo) {
        studentStatusInfoService.update(studentStatusInfo);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "根据id查询")
    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        StudentStatusInfo studentStatusInfo = studentStatusInfoService.findById(id);
        return ResultGenerator.genSuccessResult(studentStatusInfo);
    }

    @ApiOperation(value = "分页查询")
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<StudentStatusInfo> list = studentStatusInfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
