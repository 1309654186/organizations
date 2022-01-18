package com.controller;

import com.entity.ScheduleSet;
import com.service.ScheduleSetService;
import com.service.ScheduleSetQto;
import com.service.ScheduleSetNto;
import com.service.ScheduleSetEto;
import com.service.ScheduleSetTo;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;
import javax.validation.Valid;
import javax.annotation.Resource;

/**
 * 班次(ScheduleSet)控制层
 *
 * @author makejava
 * @since 2022-01-13 20:29:21
 */
@RestController
@RequestMapping(value = "/api/scheduleSet", produces = "application/json; charset=utf-8")
@Api(value = "/api/scheduleSet", tags = "班次API管理")
@Validated
public class ScheduleSetController {

    @Resource
    private ScheduleSetService scheduleSetService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 标识
     * @return 单条数据
     */
    @GetMapping(value = "/{id}")
	@ApiOperation(value = "查询一条班次")
    public ScheduleSetTo selectOne(@PathVariable("id") String id) {
        return scheduleSetService.selectById(id);
    }
    
    /**
     * 新增一条数据
     *
     * @param scheduleSet 实体类
     * @return SystemResponse对象
     */
    @PostMapping(value = "/insert")
	@ApiOperation(value = "添加一条班次")
    public ScheduleSetTo insert(@RequestBody @Valid ScheduleSetNto scheduleSet) {
        return scheduleSetService.insert(scheduleSet);
    }

    /**
     * 修改一条数据
     *
     * @return SystemResponse对象
     */
    @PutMapping(value = "/update")
	@ApiOperation(value = "修改一条班次")
    public Boolean update(@RequestBody ScheduleSetEto scheduleSet ) {
        return scheduleSetService.update(scheduleSet);
    }

    /**
     * 删除一条数据
     *
     * @param id 标识
     * @return SystemResponse对象
     */
    @DeleteMapping(value = "/delete/{id}")
	@ApiOperation(value = "删除一条班次")
    public Boolean delete(@PathVariable("id") String id) {
        return scheduleSetService.deleteById(id);
    }

    /**
     * 分页查询
     *
     */
    @GetMapping(value = "/all")
	@ApiOperation(value = "分页查询班次")
    public IPage<ScheduleSet> getAll(ScheduleSetQto qto) {
        return scheduleSetService.selectPage(qto.getPage(), qto.getWrapper());
    }

    @PutMapping(value = "/enabled/{id}")
    @ApiOperation(value = "启用班次信息")
    public int enabledById(@PathVariable("id") String id){
        return scheduleSetService.updateEnabledById(true,id);
    }

    @PutMapping(value = "/disabled/{id}")
    @ApiOperation(value = "禁用班次信息")
    public int disabledById(@PathVariable("id") String id){
        return scheduleSetService.updateEnabledById(false,id);
    }
}