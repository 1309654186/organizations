package com.dao;

import com.baomidou.mybatisplus.core.injector.methods.UpdateById;
import org.apache.ibatis.annotations.Param;

import com.entity.DictList;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 字典集合(DictList)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-07 17:18:17
 */
@Mapper
public interface DictListMapper extends BaseMapper<DictList> {

    List<DictList> selectListByDictTypeAndEnabled(String type, boolean enabled);

    List<DictList> selectAllDictListByDictType(String type);

    int countByTypeAndCode(String type, String code);

    int updateEnabledById(@Param("enabled") boolean enabled, @Param("id") String id);
}