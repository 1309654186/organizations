package com.service.impl;
import com.entity.BaseDepartment;
import com.neusoft.mybatis.expand.global.BusinessException;
import com.neusoft.mybatis.expand.utils.BaseAssemblerUtils;
import com.entity.DictList;
import com.dao.DictListMapper;
import com.service.*;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 字典集合(DictList表)服务实现类
 *
 * @author makejava
 * @since 2022-01-07 17:18:22
 */
@Service("dictListService")
@Transactional(rollbackFor = Throwable.class)
public class DictListServiceImpl extends ServiceImpl<DictListMapper, DictList> implements DictListService {

    @Resource
    private DictListMapper dictListMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
	@Transactional(rollbackFor = Throwable.class, readOnly = true)
    public DictListTo selectById(String id) {
        return (DictListTo)BaseAssemblerUtils.populate(super.getById(id), new DictListTo());
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
    public IPage<DictList> selectPage(Page page, QueryWrapper queryWrapper) {
        return super.page(page, queryWrapper);
    }
    
    /**
     * 新增数据
     *
     * @param dictListNto 实例对象
     * @return 实例对象
     */
    @Override
	@Transactional(rollbackFor = Throwable.class, readOnly = false)
    public DictListTo insert(DictListNto dictListNto) {
        int num = dictListMapper.countByTypeAndCode( dictListNto.getType(),dictListNto.getCode());
        if(num>0)
            throw new BusinessException("该编码已存在，请修改！");
		DictList dictList = BaseAssemblerUtils.populate(dictListNto, DictList.class);
		super.save(dictList);
		return BaseAssemblerUtils.populate(dictList, DictListTo.class);
    }

    /**
     * 批量新增
     *
     * @param dictListNtos 实例对象的集合
     * @return 生效的条数
     */
    @Override
	@Transactional(rollbackFor = Throwable.class, readOnly = false)
    public boolean batchInsert(List<DictListNto> dictListNtos) {
		List<DictList> dictList = BaseAssemblerUtils.populateList(dictListNtos, DictList.class);
		return super.saveBatch(dictList, dictList .size());
    }

    /**
     * 修改数据
     *
     * @param dictListEto 实例对象
     * @return 实例对象
     */
    @Override
	@Transactional(rollbackFor = Throwable.class, readOnly = false)
    public boolean update(DictListEto dictListEto) {  
		DictList dictListEntity = super.getById(dictListEto .getId());
		Assert.notNull(dictListEntity, "根据标识，没有找到指定实体！");
		
		DictList dictList = BaseAssemblerUtils.populate(dictListEto, DictList.class);
        return super.updateById(dictList);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
	@Transactional(rollbackFor = Throwable.class, readOnly = false)
    public boolean deleteById(String id) {
		DictList dictListEntity = super.getById(id);
		Assert.notNull(dictListEntity, "根据标识，没有找到指定实体！");
        return super.removeById(id);
    }

    @Override
	@Transactional(rollbackFor = Throwable.class, readOnly = true)
    public List<DictListTo> selectDictListByDictType(String dictType) {
		List<DictList> dictLists  = dictListMapper.selectAllDictListByDictType(dictType);
        List<DictListTo> list = new ArrayList<>();
        for (DictList dto : dictLists) {
            DictListTo to = BaseAssemblerUtils.populate(dto, DictListTo.class);
            list.add(to);
        }
        return list;
    }

    @Override
	@Transactional(rollbackFor = Throwable.class, readOnly = true)
    public List<DictListTo> selectEnabledDictListByDictType(String dictType) {
		List<DictList> dictLists  = dictListMapper.selectListByDictTypeAndEnabled(dictType,true);
        List<DictListTo> list = new ArrayList<>();
        for (DictList dto : dictLists) {
            DictListTo to = BaseAssemblerUtils.populate(dto, DictListTo.class);
            list.add(to);
        }
        return list;
    }

    @Override
    @Transactional(rollbackFor = Throwable.class, readOnly = false)
    public int updateEnabledById(String id,boolean enabled){
        return dictListMapper.updateEnabledById(enabled,id);
    }

}