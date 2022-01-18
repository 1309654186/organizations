package com.service;

import com.entity.BaseRoom;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.List;
import java.util.Map;

/**
 * (BaseRoom)表服务接口
 *
 * @author makejava
 * @since 2022-01-04 22:52:32
 */
public interface BaseRoomService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BaseRoomTo selectById(String id);

    /**
     * 分页查询
     *
     * @param page 分页
     * @param queryWrapper 查询条件
     * @return 对象列表
     */
    IPage<BaseRoom> selectPage(Page page, QueryWrapper queryWrapper);

    /**
     * 新增数据
     *
     * @param baseRoom 实例对象
     * @return 影响行数
     */
    BaseRoomTo insert(BaseRoomNto baseRoom);
	
	/**
     * 批量新增
     *
     * @param baseRooms 实例对象的集合
     * @return 影响行数
     */
	boolean batchInsert(List<BaseRoomNto> baseRooms);
	
    /**
     * 修改数据
     *
     * @param baseRoom 实例对象
     * @return 修改
     */
    boolean update(BaseRoomEto baseRoom);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    boolean deleteById(String id);

    /**
     * 根据科室标识获取治疗室
     * @param deptId
     * @return
     */
    List<BaseRoomTo> selectListByDeptId(String deptId);

    int updateEnabledById(Boolean enabled, String id);
}