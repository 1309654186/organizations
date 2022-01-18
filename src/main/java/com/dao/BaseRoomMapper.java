package com.dao;

import com.entity.BaseDepartment;
import com.entity.BaseRoom;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * (BaseRoom)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-04 22:52:31
 */
@Mapper
public interface BaseRoomMapper extends BaseMapper<BaseRoom> {

    List<BaseRoom> selectByDeptIdAndEnabled(@Param("deptId") String deptId, @Param("enabled") Boolean enabled);

    int updateEnabledById(@Param("enabled") Boolean enabled, @Param("id") String id);
}