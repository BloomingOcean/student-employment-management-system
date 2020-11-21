package com.liyang.sems.web;
import com.liyang.sems.core.Result;
import com.liyang.sems.core.ResultGenerator;
import com.liyang.sems.model.School;
import com.liyang.sems.service.SchoolService;
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
@RequestMapping("/school")
@CrossOrigin
@Api(tags = "学校信息管理")
public class SchoolController {
    @Resource
    private SchoolService schoolService;

    @ApiOperation(value = "学校信息-添加")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Result add(@RequestBody School school) {
        schoolService.save(school);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "学校信息-根据id删除")
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public Result delete(@RequestParam Integer id) {
        schoolService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "学校信息-根据id更新")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Result update(School school) {
        schoolService.update(school);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "学校信息-根据id查询")
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public Result detail(@RequestParam Integer id) {
        School school = schoolService.findById(id);
        return ResultGenerator.genSuccessResult(school);
    }

    @ApiOperation(value = "学校信息-分页查询")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<School> list = schoolService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
