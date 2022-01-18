package com.dao;
import org.apache.ibatis.annotations.Param;

import com.entity.ScheduleSet;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
/**
 * 班次(ScheduleSet)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-13 20:29:21
 */
@Mapper
public interface ScheduleSetMapper extends BaseMapper<ScheduleSet> {

    int updateEnabledById(@Param("enabled") boolean enabled, @Param("id") String id);
}