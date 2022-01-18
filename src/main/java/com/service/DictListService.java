package com.service;

import com.entity.DictList;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.List;
import java.util.Map;

/**
 * 字典集合(DictList)表服务接口
 *
 * @author makejava
 * @since 2022-01-07 17:18:21
 */
public interface DictListService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DictListTo selectById(String id);

    /**
     * 分页查询
     *
     * @param page 分页
     * @param queryWrapper 查询条件
     * @return 对象列表
     */
    IPage<DictList> selectPage(Page page, QueryWrapper queryWrapper);

    /**
     * 新增数据
     *
     * @param dictList 实例对象
     * @return 影响行数
     */
    DictListTo insert(DictListNto dictList);
	
	/**
     * 批量新增
     *
     * @param dictLists 实例对象的集合
     * @return 影响行数
     */
	boolean batchInsert(List<DictListNto> dictLists);
	
    /**
     * 修改数据
     *
     * @param dictList 实例对象
     * @return 修改
     */
    boolean update(DictListEto dictList);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    boolean deleteById(String id);

    List<DictListTo> selectDictListByDictType(String dictType);

    List<DictListTo> selectEnabledDictListByDictType(String dictType);

    int updateEnabledById(String id,boolean enabled);
}