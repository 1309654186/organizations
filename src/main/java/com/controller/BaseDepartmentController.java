package com.controller;

import com.entity.BaseDepartment;
import com.entity.BaseHospital;
import com.service.*;

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
 * 科室(BaseDepartment)控制层
 *
 * @author makejava
 * @since 2022-01-04 22:40:26
 */
@RestController
@RequestMapping(value = "/api/baseDepartment", produces = "application/json; charset=utf-8")
@Api(value = "/api/baseDepartment", tags = "科室API管理")
@Validated
public class BaseDepartmentController {

    @Resource
    private BaseDepartmentService baseDepartmentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 标识
     * @return 单条数据
     */
    @GetMapping(value = "/{id}")
    @ApiOperation(value = "查询一条科室")
    public BaseDepartmentTo selectOne(@PathVariable("id") String id) {
        return baseDepartmentService.selectById(id);
    }

    /**
     * 新增一条数据
     *
     * @param baseDepartment 实体类
     * @return SystemResponse对象
     */
    @PostMapping(value = "/insert")
    @ApiOperation(value = "添加一条科室")
    public BaseDepartmentTo insert(@RequestBody @Valid BaseDepartmentNto baseDepartment) {
        return baseDepartmentService.insert(baseDepartment);
    }

    /**
     * 批量新增
     *
     * @param baseDepartment 实体类集合
     * @return SystemResponse对象
     */
    @PostMapping(value = "/insert/batch")
    @ApiOperation(value = "批量添加科室")
    public boolean batchInsert(@RequestBody @Valid List<BaseDepartmentNto> baseDepartment) {
        return baseDepartmentService.batchInsert(baseDepartment);
    }

    /**
     * 修改一条数据
     *
     * @return SystemResponse对象
     */
    @PutMapping(value = "/update")
    @ApiOperation(value = "修改一条科室")
    public boolean update(@RequestBody BaseDepartmentEto baseDepartment ) {
        return baseDepartmentService.update(baseDepartment);
    }

    /**
     * 删除一条数据
     *
     * @param id 标识
     * @return SystemResponse对象
     */
    @DeleteMapping(value = "/delete/{id}")
    @ApiOperation(value = "删除一条科室")
    public boolean delete(@PathVariable("id") String id) {
        return baseDepartmentService.deleteById(id);
    }

    /**
     * 分页查询
     *
     */
    @GetMapping(value = "/all")
    @ApiOperation(value = "分页查询科室")
    public IPage<BaseDepartment> getAll(BaseDepartmentQto qto) {
        return baseDepartmentService.selectPage(qto.getPage(), qto.getWrapper());
    }
    /**
     * 根据医院标识查询科室列表
     *
     */
    @GetMapping(value = "/dept/{hospitalId}")
    @ApiOperation(value = "根据医院标识查询科室")
    public List<BaseDepartmentTo> getDeptListByHospital(@PathVariable("hospitalId")String hospitalId) {
        return baseDepartmentService.selectListByHospitalId(hospitalId);
    }

    @PutMapping(value = "/enabled/{id}")
    @ApiOperation(value = "启用禁用")
    public int updateEnabledById(@RequestParam("enabled") Boolean enabled, @PathVariable("id") String id) {
        return baseDepartmentService.updateEnabledById(enabled, id);
    }
}