package com.dao;

import com.entity.DictType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
/**
 * 字典类型(DictType)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-07 17:00:31
 */
@Mapper
public interface DictTypeMapper extends BaseMapper<DictType> {


}