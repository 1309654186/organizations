package com.service;

import com.entity.ScheduleSet;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 班次(ScheduleSet)表服务接口
 *
 * @author makejava
 * @since 2022-01-13 20:29:21
 */
public interface ScheduleSetService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ScheduleSetTo selectById(String id);

    /**
     * 分页查询
     *
     * @param page 分页
     * @param queryWrapper 查询条件
     * @return 对象列表
     */
    IPage<ScheduleSet> selectPage(Page page, QueryWrapper queryWrapper);

    /**
     * 新增数据
     *
     * @param scheduleSet 实例对象
     * @return 影响行数
     */
    ScheduleSetTo insert(ScheduleSetNto scheduleSet);
	
	/**
     * 批量新增
     *
     * @param scheduleSets 实例对象的集合
     * @return 影响行数
     */
	boolean batchInsert(List<ScheduleSetNto> scheduleSets);
	
    /**
     * 修改数据
     *
     * @param scheduleSet 实例对象
     * @return 修改
     */
    boolean update(ScheduleSetEto scheduleSet);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    boolean deleteById(String id);

    int updateEnabledById(boolean enabled,String id);
    
}