package com.service.impl;
import com.neusoft.mybatis.expand.utils.BaseAssemblerUtils;
import com.entity.ScheduleSet;
import com.dao.ScheduleSetMapper;
import com.service.ScheduleSetService;
import com.service.ScheduleSetTo;
import com.service.ScheduleSetEto;
import com.service.ScheduleSetNto;

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
 * 班次(ScheduleSet表)服务实现类
 *
 * @author makejava
 * @since 2022-01-13 20:29:21
 */
@Service("scheduleSetService")
@Transactional(rollbackFor = Throwable.class)
public class ScheduleSetServiceImpl extends ServiceImpl<ScheduleSetMapper, ScheduleSet> implements ScheduleSetService {

    @Resource
    private ScheduleSetMapper scheduleSetMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
	@Transactional(rollbackFor = Throwable.class, readOnly = true)
    public ScheduleSetTo selectById(String id) {
        return (ScheduleSetTo)BaseAssemblerUtils.populate(super.getById(id), new ScheduleSetTo());
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
    public IPage<ScheduleSet> selectPage(Page page, QueryWrapper queryWrapper) {
        return super.page(page, queryWrapper);
    }
    
    /**
     * 新增数据
     *
     * @param scheduleSetNto 实例对象
     * @return 实例对象
     */
    @Override
	@Transactional(rollbackFor = Throwable.class, readOnly = false)
    public ScheduleSetTo insert(ScheduleSetNto scheduleSetNto) {
		ScheduleSet scheduleSet = BaseAssemblerUtils.populate(scheduleSetNto, ScheduleSet.class);
		super.save(scheduleSet);
		return BaseAssemblerUtils.populate(scheduleSet, ScheduleSetTo.class);
    }

    /**
     * 批量新增
     *
     * @param scheduleSetNtos 实例对象的集合
     * @return 生效的条数
     */
    @Override
	@Transactional(rollbackFor = Throwable.class, readOnly = false)
    public boolean batchInsert(List<ScheduleSetNto> scheduleSetNtos) {
		List<ScheduleSet> scheduleSet = BaseAssemblerUtils.populateList(scheduleSetNtos, ScheduleSet.class);
		return super.saveBatch(scheduleSet, scheduleSet .size());
    }

    /**
     * 修改数据
     *
     * @param scheduleSetEto 实例对象
     * @return 实例对象
     */
    @Override
	@Transactional(rollbackFor = Throwable.class, readOnly = false)
    public boolean update(ScheduleSetEto scheduleSetEto) {  
		ScheduleSet scheduleSetEntity = super.getById(scheduleSetEto .getId());
		Assert.notNull(scheduleSetEntity, "根据标识，没有找到指定实体！");
		
		ScheduleSet scheduleSet = BaseAssemblerUtils.populate(scheduleSetEto, ScheduleSet.class);
        return super.updateById(scheduleSet);
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
		ScheduleSet scheduleSetEntity = super.getById(id);
		Assert.notNull(scheduleSetEntity, "根据标识，没有找到指定实体！");
        return super.removeById(id);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class, readOnly = false)
    public int updateEnabledById(boolean enabled,String id){
        ScheduleSet scheduleSetEntity = super.getById(id);
        Assert.notNull(scheduleSetEntity, "根据标识，没有找到指定实体！");
        return scheduleSetMapper.updateEnabledById(enabled,id);
    }
}