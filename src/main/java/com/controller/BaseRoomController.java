package com.controller;

import com.entity.BaseRoom;
import com.service.BaseRoomService;
import com.service.BaseRoomQto;
import com.service.BaseRoomNto;
import com.service.BaseRoomEto;
import com.service.BaseRoomTo;

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
 * (BaseRoom)控制层
 *
 * @author makejava
 * @since 2022-01-04 22:52:30
 */
@RestController
@RequestMapping(value = "/api/baseRoom", produces = "application/json; charset=utf-8")
@Api(value = "/api/baseRoom", tags = "治疗室API管理")
@Validated
public class BaseRoomController {

    @Resource
    private BaseRoomService baseRoomService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 标识
     * @return 单条数据
     */
    @GetMapping(value = "/{id}")
	@ApiOperation(value = "查询一条治疗室")
    public BaseRoomTo selectOne(@PathVariable("id") String id) {
        return baseRoomService.selectById(id);
    }
    
    /**
     * 新增一条数据
     *
     * @param baseRoom 实体类
     * @return SystemResponse对象
     */
    @PostMapping(value = "/insert")
	@ApiOperation(value = "添加一条治疗室")
    public BaseRoomTo insert(@RequestBody @Valid BaseRoomNto baseRoom) {
        return baseRoomService.insert(baseRoom);
    }
	
	/**
     * 批量新增
     *
     * @param baseRoom 实体类集合
     * @return SystemResponse对象
     */
    @PostMapping(value = "/insert/batch")
	@ApiOperation(value = "批量添加治疗室")
    public boolean batchInsert(@RequestBody @Valid List<BaseRoomNto> baseRoom) {
        return baseRoomService.batchInsert(baseRoom);
    }

    /**
     * 修改一条数据
     *
     * @return SystemResponse对象
     */
    @PutMapping(value = "/update")
	@ApiOperation(value = "修改一条治疗室")
    public boolean update(@RequestBody BaseRoomEto baseRoom ) {
        return baseRoomService.update(baseRoom);
    }

    /**
     * 删除一条数据
     *
     * @param id 标识
     * @return SystemResponse对象
     */
    @DeleteMapping(value = "/delete/{id}")
	@ApiOperation(value = "删除一条治疗室")
    public boolean delete(@PathVariable("id") String id) {
        return baseRoomService.deleteById(id);
    }

    /**
     * 分页查询
     *
     */
    @GetMapping(value = "/all")
	@ApiOperation(value = "分页查询治疗室")
    public IPage<BaseRoom>  getAll(BaseRoomQto qto) {
        return baseRoomService.selectPage(qto.getPage(), qto.getWrapper());
    }
    /**
     * 根据科室编码查询治疗室
     *
     */
    @GetMapping(value = "/room/{deptId}")
    @ApiOperation(value = "根据科室标识查询治疗室")
    List<BaseRoomTo> selectListByDeptId(@PathVariable("deptId")String deptId){
        return baseRoomService.selectListByDeptId(deptId);
    }

    @PutMapping(value = "/enabled/{id}")
    @ApiOperation(value = "启用禁用")
    public int updateEnabledById(@RequestParam("enabled") Boolean enabled, @PathVariable("id") String id) {
        return baseRoomService.updateEnabledById(enabled, id);
    }
}