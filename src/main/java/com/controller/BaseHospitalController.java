package com.controller;

import com.entity.BaseHospital;

import com.neusoft.mybatis.expand.idempotent.ExtApiIdempotent;
import com.neusoft.mybatis.expand.jwt.TokenProvider;
import com.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;
import javax.validation.Valid;
import javax.annotation.Resource;

/**
 * 院区(BaseHospital)控制层
 *
 * @author yufeng
 * @since 2021-07-27 09:26:02
 */
@RestController
@RequestMapping(value = "/api/baseHospital", produces = "application/json; charset=utf-8")
@Api(value = "/api/baseHospital", tags = "医院API管理")
@Validated
public class BaseHospitalController {

    @Resource
    private BaseHospitalService baseHospitalService;
    @Resource
    private BaseDepartmentService baseDepartmentService;

    @Autowired
    private TokenProvider tokenProvider;

    @Autowired
    private AuthenticationManagerBuilder authenticationManagerBuilder;

    /**
     * 通过主键查询单条数据
     *
     * @param id 标识
     * @return 单条数据
     */
    @GetMapping(value = "/{id}")
    @ApiOperation(value = "查询一条医院")
    public BaseHospitalTo selectOne(@PathVariable("id") String id) {
        return baseHospitalService.selectById(id);
    }

    /**
     * 新增一条数据
     *
     * @param baseHospital 实体类
     * @return SystemResponse对象
     */
    @PostMapping(value = "/insert")
    @ApiOperation(value = "添加一条医院")
    @ExtApiIdempotent
    public BaseHospitalTo insert(@RequestBody @Valid BaseHospitalNto baseHospital) {
        return baseHospitalService.insert(baseHospital);
    }

    /**
     * 批量新增
     *
     * @param baseHospital 实体类集合
     * @return SystemResponse对象
     */
    @PostMapping(value = "/insert/batch")
    @ApiOperation(value = "批量添加医院")
    public boolean batchInsert(@RequestBody @Valid List<BaseHospitalNto> baseHospital) {
        return baseHospitalService.batchInsert(baseHospital);
    }

    /**
     * 修改一条数据
     *
     * @return SystemResponse对象
     */
    @PutMapping(value = "/update")
    @ApiOperation(value = "修改一条医院")
    public boolean update(@RequestBody @Valid BaseHospitalEto baseHospital) {
        return baseHospitalService.update(baseHospital);
    }

    /**
     * 删除一条数据
     *
     * @param id 标识
     * @return SystemResponse对象
     */
    @DeleteMapping(value = "/delete/{id}")
    @ApiOperation(value = "删除一条医院")
    public boolean delete(@PathVariable("id") String id) {
        return baseHospitalService.deleteById(id);
    }

    /**
     * 分页查询
     */
    @GetMapping(value = "/all")
    @ApiOperation(value = "分页查询医院")
    public IPage<BaseHospital> getAll(BaseHospitalQto qto) {
        return baseHospitalService.selectPage(qto.getPage(), qto.getWrapper());
    }

    @PutMapping(value = "/enabled/{id}")
    @ApiOperation(value = "启用禁用")
    public int updateEnabledById(@RequestParam("enabled") Boolean enabled, @PathVariable("id") String id) {
        return baseHospitalService.updateEnabledById(enabled, id);
    }

    /**
     * 获取组织树
     */
    @GetMapping(value = "/allOrganization")
    @ApiOperation(value = "获取组织树")
    public List<BaseHospitalTo> getAllOrganization() {
        List<BaseHospitalTo> hospitalTos = baseHospitalService.selectAllHospital();
        for (BaseHospitalTo hto: hospitalTos) {
            List<BaseDepartmentTo> childs = baseDepartmentService.selectListByHospitalId(hto.getId());
            hto.setChildren(childs);
        }
        return hospitalTos;
    }
}