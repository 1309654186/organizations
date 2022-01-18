package com.service.impl;
import com.neusoft.mybatis.expand.utils.BaseAssemblerUtils;
import com.entity.DictType;
import com.dao.DictTypeMapper;
import com.service.*;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 字典类型(DictType表)服务实现类
 *
 * @author makejava
 * @since 2022-01-07 17:00:34
 */
@Service("dictTypeService")
@Transactional(rollbackFor = Throwable.class)
public class DictTypeServiceImpl extends ServiceImpl<DictTypeMapper, DictType> implements DictTypeService {

    @Resource
    private DictTypeMapper dictTypeMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param code 主键
     * @return 实例对象
     */
    @Override
	@Transactional(rollbackFor = Throwable.class, readOnly = true)
    public DictTypeTo selectById(String code) {
        return (DictTypeTo)BaseAssemblerUtils.populate(super.getById(code), new DictTypeTo());
    }

    /**
     * 分页查询
     *
     * @param page 分页
     * @param queryWrapper 查询条件
     * @return 对象列表
     */
    @Override
	@Transactional(rollbackFor = Throwable.class, readOnly = true)
    public IPage<DictType> selectPage(Page page, QueryWrapper queryWrapper) {
        return super.page(page, queryWrapper);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class, readOnly = true)
    public IPage<DictType> selectByCodeOrNamePage(DictTypeQto qto) {
        QueryWrapper<DictType> queryWrapper = new QueryWrapper<DictType>();
        if (StringUtils.isNotBlank(qto.getCode().getValue()) || StringUtils.isNotBlank(qto.getName().getValue())) {
            queryWrapper.and(wrapper -> {
                if (StringUtils.isNotBlank(qto.getCode().getValue())) {
                    wrapper.or().like("code", qto.getCode().getValue());
                }
                if (StringUtils.isNotBlank(qto.getName().getValue())) {
                    wrapper.or().like("name", qto.getName().getValue());
                }
            });
        }
        return super.page(qto.getPage(), queryWrapper);
    }

    /**
     * 新增数据
     *
     * @param dictTypeNto 实例对象
     * @return 实例对象
     */
    @Override
	@Transactional(rollbackFor = Throwable.class, readOnly = false)
    public DictTypeTo insert(DictTypeNto dictTypeNto) {
		DictType dictType = BaseAssemblerUtils.populate(dictTypeNto, DictType.class);
		super.save(dictType);
		return BaseAssemblerUtils.populate(dictType, DictTypeTo.class);
    }

    /**
     * 批量新增
     *
     * @param dictTypeNtos 实例对象的集合
     * @return 生效的条数
     */
    @Override
	@Transactional(rollbackFor = Throwable.class, readOnly = false)
    public boolean batchInsert(List<DictTypeNto> dictTypeNtos) {
		List<DictType> dictType = BaseAssemblerUtils.populateList(dictTypeNtos, DictType.class);
		return super.saveBatch(dictType, dictType .size());
    }

    /**
     * 修改数据
     *
     * @param dictTypeEto 实例对象
     * @return 实例对象
     */
    @Override
	@Transactional(rollbackFor = Throwable.class, readOnly = false)
    public boolean update(DictTypeEto dictTypeEto) {  
		DictType dictTypeEntity = super.getById(dictTypeEto .getCode());
		Assert.notNull(dictTypeEntity, "根据标识，没有找到指定实体！");
		
		DictType dictType = BaseAssemblerUtils.populate(dictTypeEto, DictType.class);
        return super.updateById(dictType);
    }

    /**
     * 通过主键删除数据
     *
     * @param code 主键
     * @return 是否成功
     */
    @Override
	@Transactional(rollbackFor = Throwable.class, readOnly = false)
    public boolean deleteById(String code) {
		DictType dictTypeEntity = super.getById(code);
		Assert.notNull(dictTypeEntity, "根据标识，没有找到指定实体！");
        return super.removeById(code);
    }

}