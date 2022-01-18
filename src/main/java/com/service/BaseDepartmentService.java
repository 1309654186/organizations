package com.service;

import com.entity.BaseDepartment;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 科室(BaseDepartment)表服务接口
 *
 * @author makejava
 * @since 2022-01-04 22:40:26
 */
public interface BaseDepartmentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BaseDepartmentTo selectById(String id);

    /**
     * 分页查询
     *
     * @param page 分页
     * @param queryWrapper 查询条件
     * @return 对象列表
     */
    IPage<BaseDepartment> selectPage(Page page, QueryWrapper queryWrapper);

    /**
     * 新增数据
     *
     * @param baseDepartment 实例对象
     * @return 影响行数
     */
    BaseDepartmentTo insert(BaseDepartmentNto baseDepartment);
	
	/**
     * 批量新增
     *
     * @param baseDepartments 实例对象的集合
     * @return 影响行数
     */
	boolean batchInsert(List<BaseDepartmentNto> baseDepartments);
	
    /**
     * 修改数据
     *
     * @param baseDepartment 实例对象
     * @return 修改
     */
    boolean update(BaseDepartmentEto baseDepartment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    boolean deleteById(String id);

    /**
     * 根据医院标识获取科室
     * @param hospitalId
     * @return
     */
    List<BaseDepartmentTo> selectListByHospitalId(String hospitalId);

    int updateEnabledById(Boolean enabled, String id);
}