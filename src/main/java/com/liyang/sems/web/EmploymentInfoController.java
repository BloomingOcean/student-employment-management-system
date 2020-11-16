package com.liyang.sems.web;
import com.liyang.sems.core.Result;
import com.liyang.sems.core.ResultGenerator;
import com.liyang.sems.model.EmploymentInfo;
import com.liyang.sems.service.EmploymentInfoService;
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
@RequestMapping("/employmentinfo")
@Api(tags = "就业信息管理")
public class EmploymentInfoController {
    @Resource
    private EmploymentInfoService employmentInfoService;

    @ApiOperation(value = "添加")
    @PostMapping("/add")
    public Result add(@RequestBody EmploymentInfo employmentInfo) {
        employmentInfoService.save(employmentInfo);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "根据id删除")
    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        employmentInfoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "根据id更新")
    @PostMapping("/update")
    public Result update(EmploymentInfo employmentInfo) {
        employmentInfoService.update(employmentInfo);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "根据id查询")
    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        EmploymentInfo employmentInfo = employmentInfoService.findById(id);
        return ResultGenerator.genSuccessResult(employmentInfo);
    }

    @ApiOperation(value = "分页查询")
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<EmploymentInfo> list = employmentInfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
