package com.liyang.sems.web;
import com.liyang.sems.core.Result;
import com.liyang.sems.core.ResultGenerator;
import com.liyang.sems.model.PostgraduateInfo;
import com.liyang.sems.service.PostgraduateInfoService;
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
@RequestMapping("/postgraduateinfo")
@CrossOrigin
@Api(tags = "考研信息管理")
public class PostgraduateInfoController {
    @Resource
    private PostgraduateInfoService postgraduateInfoService;

    @ApiOperation(value = "考研信息-添加")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Result add(@RequestBody PostgraduateInfo postgraduateInfo) {
        postgraduateInfoService.save(postgraduateInfo);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "考研信息-根据id删除")
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public Result delete(@RequestParam Integer id) {
        postgraduateInfoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "考研信息-根据id更新")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Result update(PostgraduateInfo postgraduateInfo) {
        postgraduateInfoService.update(postgraduateInfo);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "考研信息-根据id查询")
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public Result detail(@RequestParam Integer id) {
        PostgraduateInfo postgraduateInfo = postgraduateInfoService.findById(id);
        return ResultGenerator.genSuccessResult(postgraduateInfo);
    }

    @ApiOperation(value = "考研信息-分页查询")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<PostgraduateInfo> list = postgraduateInfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @ApiOperation(value = "考研信息-根据用户id获得info")
    @RequestMapping(value = "/getbyid", method = RequestMethod.GET)
    public Result getInfoById(Integer stuId) {
        return postgraduateInfoService.getInfoByUserId(stuId);
    }
}
