package com.liyang.sems.web;
import com.liyang.sems.core.Result;
import com.liyang.sems.core.ResultGenerator;
import com.liyang.sems.model.Punish;
import com.liyang.sems.service.PunishService;
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
@RequestMapping("/punish")
@Api(tags = "处分信息管理")
public class PunishController {
    @Resource
    private PunishService punishService;

    @ApiOperation(value = "添加")
    @PostMapping("/add")
    public Result add(@RequestBody Punish punish) {
        punishService.save(punish);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "根据id删除")
    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        punishService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "根据id更新")
    @PostMapping("/update")
    public Result update(Punish punish) {
        punishService.update(punish);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "根据id查询")
    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Punish punish = punishService.findById(id);
        return ResultGenerator.genSuccessResult(punish);
    }

    @ApiOperation(value = "分页查询")
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Punish> list = punishService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
