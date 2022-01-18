package com.service.impl;

import cn.hutool.extra.pinyin.PinyinUtil;
import com.dao.BaseRoomMapper;
import com.entity.BaseHospital;
import com.neusoft.mybatis.expand.utils.BaseAssemblerUtils;
import com.entity.BaseDepartment;
import com.dao.BaseDepartmentMapper;
import com.service.*;

import org.apache.logging.log4j.util.Strings;
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

/**
 * 科室(BaseDepartment表)服务实现类
 *
 * @author makejava
 * @since 2022-01-04 22:40:26
 */
@Service("baseDepartmentService")
@Transactional(rollbackFor = Throwable.class)
public class BaseDepartmentServiceImpl extends ServiceImpl<BaseDepartmentMapper, BaseDepartment> implements BaseDepartmentService {

    @Resource
    private BaseDepartmentMapper baseDepartmentMapper;
    @Resource
    private BaseRoomMapper baseRoomMapper;
    @Resource
    private BaseRoomService baseRoomService;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    @Transactional(rollbackFor = Throwable.class, readOnly = true)
    public BaseDepartmentTo selectById(String id) {
        return (BaseDepartmentTo) BaseAssemblerUtils.populate(super.getById(id), new BaseDepartmentTo());
    }

    /**
     * 分页查询
     *
     * @param page         分页
     * @param queryWrapper 查询条件
     * @return 对象列表
     */
    @Override
    @Transactional(rollbackFor = Throwable.class, readOnly = true)
    public IPage<BaseDepartment> selectPage(Page page, QueryWrapper queryWrapper) {
        return super.page(page, queryWrapper);
    }

    /**
     * 新增数据
     *
     * @param baseDepartmentNto 实例对象
     * @return 实例对象
     */
    @Override
    @Transactional(rollbackFor = Throwable.class, readOnly = false)
    public BaseDepartmentTo insert(BaseDepartmentNto baseDepartmentNto) {
        BaseDepartment baseDepartment = BaseAssemblerUtils.populate(baseDepartmentNto, BaseDepartment.class);
        baseDepartment.setEnabled(true);
//        baseDepartment.setPinyinCode(PinyinUtil.getFirstLetter(baseDepartmentNto.getName(), Strings.EMPTY));
        super.save(baseDepartment);
        return BaseAssemblerUtils.populate(baseDepartment, BaseDepartmentTo.class);
    }

    /**
     * 批量新增
     *
     * @param baseDepartmentNtos 实例对象的集合
     * @return 生效的条数
     */
    @Override
    @Transactional(rollbackFor = Throwable.class, readOnly = false)
    public boolean batchInsert(List<BaseDepartmentNto> baseDepartmentNtos) {
        List<BaseDepartment> baseDepartment = BaseAssemblerUtils.populateList(baseDepartmentNtos, BaseDepartment.class);
        return super.saveBatch(baseDepartment, baseDepartment.size());
    }

    /**
     * 修改数据
     *
     * @param baseDepartmentEto 实例对象
     * @return 实例对象
     */
    @Override
    @Transactional(rollbackFor = Throwable.class, readOnly = false)
    public boolean update(BaseDepartmentEto baseDepartmentEto) {
        BaseDepartment baseDepartmentEntity = super.getById(baseDepartmentEto.getId());
        Assert.notNull(baseDepartmentEntity, "根据标识，没有找到指定实体！");

        BaseDepartment baseDepartment = BaseAssemblerUtils.populate(baseDepartmentEto, BaseDepartment.class);
        return super.updateById(baseDepartment);
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
        BaseDepartment baseDepartmentEntity = super.getById(id);
        Assert.notNull(baseDepartmentEntity, "根据标识，没有找到指定实体！");
        return super.removeById(id);
    }

    /**
     * 根据医院标识获取科室
     *
     * @return
     */
    @Override
    @Transactional(rollbackFor = Throwable.class, readOnly = false)
    public List<BaseDepartmentTo> selectListByHospitalId(String hospitalId) {
        List<BaseDepartment> info = baseDepartmentMapper.selectByHospitalIdAndEnabled(hospitalId, true);
        List<BaseDepartmentTo> list = new ArrayList<>();
        for (BaseDepartment dto : info) {
            BaseDepartmentTo to = BaseAssemblerUtils.populate(dto, BaseDepartmentTo.class);
            list.add(to);
        }
        return list;
    }

    @Override
    @Transactional(rollbackFor = Throwable.class, readOnly = false)
    public int updateEnabledById(Boolean enabled, String id) {
        return baseDepartmentMapper.updateEnabledById(enabled, id);
    }
}