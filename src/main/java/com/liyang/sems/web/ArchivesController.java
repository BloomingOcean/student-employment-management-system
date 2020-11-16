package com.liyang.sems.web;
import com.liyang.sems.core.Result;
import com.liyang.sems.core.ResultGenerator;
import com.liyang.sems.model.Archives;
import com.liyang.sems.service.ArchivesService;
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
@RequestMapping("/archives")
@Api(tags = "档案信息管理")
public class ArchivesController {
    @Resource
    private ArchivesService archivesService;

    @ApiOperation(value = "添加")
    @PostMapping("/add")
    public Result add(@RequestBody Archives archives) {
        archivesService.save(archives);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "根据id删除")
    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        archivesService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "根据id更新")
    @PostMapping("/update")
    public Result update(Archives archives) {
        archivesService.update(archives);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "根据id查询")
    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Archives archives = archivesService.findById(id);
        return ResultGenerator.genSuccessResult(archives);
    }

    @ApiOperation(value = "分页查询")
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Archives> list = archivesService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
