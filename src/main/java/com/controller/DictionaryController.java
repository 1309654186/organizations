package com.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.entity.DictList;
import com.entity.DictType;
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
 * 字典类型(DictType)控制层
 *
 * @author makejava
 * @since 2022-01-07 17:02:11
 */
@RestController
@RequestMapping(value = "/api/dictionary", produces = "application/json; charset=utf-8")
@Api(value = "/api/dictionary", tags = "字典API管理")
@Validated
public class DictionaryController {

    @Resource
    private DictTypeService dictTypeService;

    @Resource
    private DictListService dictListService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 标识
     * @return 单条数据
     */
    @GetMapping(value = "/{id}")
	@ApiOperation(value = "查询一条字典类型")
    public DictTypeTo selectOne(@PathVariable("id") String id) {
        return dictTypeService.selectById(id);
    }
    
    /**
     * 新增一条数据
     *
     * @param dictType 实体类
     * @return SystemResponse对象
     */
    @PostMapping(value = "/insert")
	@ApiOperation(value = "添加一条字典类型")
    public DictTypeTo insert(@RequestBody @Valid DictTypeNto dictType) {
        return dictTypeService.insert(dictType);
    }

    /**
     * 修改一条数据
     *
     * @return SystemResponse对象
     */
    @PutMapping(value = "/update")
	@ApiOperation(value = "修改一条字典类型")
    public Boolean update(@RequestBody DictTypeEto dictType ) {
        return dictTypeService.update(dictType);
    }

    /**
     * 删除一条数据
     *
     * @param id 标识
     * @return SystemResponse对象
     */
    @DeleteMapping(value = "/delete/{id}")
	@ApiOperation(value = "删除一条字典类型")
    public Boolean delete(@PathVariable("id") String id) {
        return dictTypeService.deleteById(id);
    }

    /**
     * 分页查询
     *
     */
    @GetMapping(value = "/all")
	@ApiOperation(value = "分页查询字典类型")
    public IPage<DictType> getAll(DictTypeQto qto) {
        return dictTypeService.selectPage(qto.getPage(), qto.getWrapper());
    }

    @GetMapping(value = "/AllList/{dictType}")
    @ApiOperation(value = "根据字典类型获取全部字典集合")
    public List<DictListTo> selectDictListByDictType(@PathVariable("dictType") String dictType) {
        return dictListService.selectDictListByDictType(dictType);
    }

    @GetMapping(value = "/EnabeldList/{dictType}")
    @ApiOperation(value = "根据字典类型获取启用字典集合")
    public List<DictListTo> selectEnabledDictListByDictType(@PathVariable("dictType") String dictType) {
        return dictListService.selectEnabledDictListByDictType(dictType);
    }

    @PostMapping(value = "/insertList")
    @ApiOperation(value = "添加一条字典集合")
    public DictListTo insertList(@RequestBody @Valid DictListNto dictList) {
        return dictListService.insert(dictList);
    }

    @PostMapping(value = "/insertList/batch")
    @ApiOperation(value = "批量添加字典集合")
    public Boolean batchInsertList(@RequestBody @Valid List<DictListNto> dictList) {
        return dictListService.batchInsert(dictList);
    }

    @PutMapping(value = "/update/List")
    @ApiOperation(value = "修改一条字典集合")
    public Boolean updateList(@RequestBody DictListEto dictList ) {
        return dictListService.update(dictList);
    }

    @DeleteMapping(value = "/deleteList/{id}")
    @ApiOperation(value = "删除一条字典集合")
    public Boolean deleteList(@PathVariable("id") String id) {
        return dictListService.deleteById(id);
    }

    @GetMapping(value = "/dicttype/like")
    @ApiOperation(value = "根据编码，名称查询字典")
    public IPage<DictType> selectByCodeOrNamePage(DictTypeQto qto) {
        return dictTypeService.selectByCodeOrNamePage(qto);
    }

    @PutMapping(value = "/enabled/list/{id}")
    @ApiOperation(value = "启用一条字典类型")
    public int updateDictListEnabledById(@PathVariable("id") String id) {
        return dictListService.updateEnabledById(id,true);
    }

    @PutMapping(value = "/disabled/list/{id}")
    @ApiOperation(value = "禁用一条字典类型")
    public int updateDictListDisabledById(@PathVariable("id") String id) {
        return dictListService.updateEnabledById(id,false);
    }

}