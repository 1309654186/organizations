package com.service;

import java.util.Date;
import java.io.Serializable;

/**
 * 班次(ScheduleSet)返回类
 *
 * @author makejava
 * @since 2022-01-13 20:29:21
 */
public class ScheduleSetTo implements Serializable {
    private static final long serialVersionUID = 173415026374497162L;
    /**
    * 班次编码ID
    */    
    private String id;
    /**
    * 班次名称
    */    
    private String name;
    /**
    * 班次简称
    */    
    private String abbreviation;
    /**
    * 备注
    */    
    private String remark;
    /**
    * 开始时间
    */    
    private Date startTime;
    /**
    * 结束时间
    */    
    private Date endTime;
    /**
    * 持续时间
    */    
    private Double lastTime;
    /**
    * 排序字段
    */    
    private Integer sortNo;
    /**
    * 启用状态
    */
    private boolean enabled;
    /**
    * 是否是值班
    */    
    private Integer isduty;
    /**
    * 创建人
    */    
    private String createMan;
    /**
    * 创建时间
    */    
    private Date createTime;
    /**
    * 最后修改人
    */    
    private String updateMan;
    /**
    * 最后修改时间
    */    
    private Date updateTime;

        
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
        
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
        
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
        
    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
        
    public Double getLastTime() {
        return lastTime;
    }

    public void setLastTime(Double lastTime) {
        this.lastTime = lastTime;
    }
        
    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }
        
    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getIsduty() {
        return isduty;
    }

    public void setIsduty(Integer isduty) {
        this.isduty = isduty;
    }
        
    public String getCreateMan() {
        return createMan;
    }

    public void setCreateMan(String createMan) {
        this.createMan = createMan;
    }
        
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
        
    public String getUpdateMan() {
        return updateMan;
    }

    public void setUpdateMan(String updateMan) {
        this.updateMan = updateMan;
    }
        
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}