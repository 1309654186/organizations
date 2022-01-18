package com.service;

import com.entity.DictType;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.List;
import java.util.Map;

/**
 * 字典类型(DictType)表服务接口
 *
 * @author makejava
 * @since 2022-01-07 17:00:34
 */
public interface DictTypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param code 主键
     * @return 实例对象
     */
    DictTypeTo selectById(String code);

    /**
     * 分页查询
     *
     * @param page 分页
     * @param queryWrapper 查询条件
     * @return 对象列表
     */
    IPage<DictType> selectPage(Page page, QueryWrapper queryWrapper);

    IPage<DictType> selectByCodeOrNamePage(DictTypeQto qto);

    /**
     * 新增数据
     *
     * @param dictType 实例对象
     * @return 影响行数
     */
    DictTypeTo insert(DictTypeNto dictType);
	
	/**
     * 批量新增
     *
     * @param dictTypes 实例对象的集合
     * @return 影响行数
     */
	boolean batchInsert(List<DictTypeNto> dictTypes);
	
    /**
     * 修改数据
     *
     * @param dictType 实例对象
     * @return 修改
     */
    boolean update(DictTypeEto dictType);

    /**
     * 通过主键删除数据
     *
     * @param code 主键
     * @return 影响行数
     */
    boolean deleteById(String code);

}