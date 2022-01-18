package com.service.impl;
import com.entity.BaseDepartment;
import com.neusoft.mybatis.expand.utils.BaseAssemblerUtils;
import com.entity.BaseRoom;
import com.dao.BaseRoomMapper;
import com.service.*;

import org.springframework.cache.annotation.CacheEvict;
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
 * (BaseRoom表)服务实现类
 *
 * @author makejava
 * @since 2022-01-04 22:52:32
 */
@Service("baseRoomService")
@Transactional(rollbackFor = Throwable.class)
public class BaseRoomServiceImpl extends ServiceImpl<BaseRoomMapper, BaseRoom> implements BaseRoomService {

    @Resource
    private BaseRoomMapper baseRoomMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
	@Transactional(rollbackFor = Throwable.class, readOnly = true)
    public BaseRoomTo selectById(String id) {
        return (BaseRoomTo)BaseAssemblerUtils.populate(super.getById(id), new BaseRoomTo());
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
    public IPage<BaseRoom> selectPage(Page page, QueryWrapper queryWrapper) {
        return super.page(page, queryWrapper);
    }
    
    /**
     * 新增数据
     *
     * @param baseRoomNto 实例对象
     * @return 实例对象
     */
    @Override
	@Transactional(rollbackFor = Throwable.class, readOnly = false)
    public BaseRoomTo insert(BaseRoomNto baseRoomNto) {
		BaseRoom baseRoom = BaseAssemblerUtils.populate(baseRoomNto, BaseRoom.class);
		super.save(baseRoom);
		return BaseAssemblerUtils.populate(baseRoom, BaseRoomTo.class);
    }

    /**
     * 批量新增
     *
     * @param baseRoomNtos 实例对象的集合
     * @return 生效的条数
     */
    @Override
	@Transactional(rollbackFor = Throwable.class, readOnly = false)
    public boolean batchInsert(List<BaseRoomNto> baseRoomNtos) {
		List<BaseRoom> baseRoom = BaseAssemblerUtils.populateList(baseRoomNtos, BaseRoom.class);
		return super.saveBatch(baseRoom, baseRoom .size());
    }

    /**
     * 修改数据
     *
     * @param baseRoomEto 实例对象
     * @return 实例对象
     */
    @Override
	@Transactional(rollbackFor = Throwable.class, readOnly = false)
    public boolean update(BaseRoomEto baseRoomEto) {
		BaseRoom baseRoomEntity = super.getById(baseRoomEto);
		Assert.notNull(baseRoomEntity, "根据标识，没有找到指定实体！");
		
		BaseRoom baseRoom = BaseAssemblerUtils.populate(baseRoomEto, BaseRoom.class);
        return super.updateById(baseRoom);
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
		BaseRoom baseRoomEntity = super.getById(id);
		Assert.notNull(baseRoomEntity, "根据标识，没有找到指定实体！");
        return super.removeById(id);
    }

    /**
     * 根据医院标识获取科室
     *
     * @return
     */
    @Override
    @Transactional(rollbackFor = Throwable.class, readOnly = false)
    public List<BaseRoomTo> selectListByDeptId(String deptId){
        List<BaseRoom> info = baseRoomMapper.selectByDeptIdAndEnabled(deptId, true);
        List<BaseRoomTo> list = new ArrayList<>();
        for (BaseRoom dto:info) {
            list.add(BaseAssemblerUtils.populate(dto, BaseRoomTo.class));
        }
        return list;
    }

    @Override
    @Transactional(rollbackFor = Throwable.class, readOnly = false)
    public int updateEnabledById(Boolean enabled, String id) {
        return baseRoomMapper.updateEnabledById(enabled, id);
    }
}