package com.dao;

import com.entity.BaseDepartment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * 科室(BaseDepartment)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-04 22:40:26
 */
@Mapper
public interface BaseDepartmentMapper extends BaseMapper<BaseDepartment> {

    List<BaseDepartment> selectByHospitalIdAndEnabled(@Param("hospitalId") String hospitalId, @Param("enabled") Boolean enabled);

    int updateEnabledById(@Param("enabled") Boolean enabled, @Param("id") String id);
}