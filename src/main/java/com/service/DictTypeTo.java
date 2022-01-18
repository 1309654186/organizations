package com.service;

import java.util.Date;
import java.io.Serializable;

/**
 * 字典类型(DictType)返回类
 *
 * @author makejava
 * @since 2022-01-07 17:00:35
 */
public class DictTypeTo implements Serializable {
    private static final long serialVersionUID = -82524642522069860L;
    /**
    * 编码
    */    
    private String code;
    /**
    * 名称
    */    
    private String name;
    /**
    * 排序码
    */    
    private Integer sortNo;
    /**
    * 备注
    */    
    private String remark;
    /**
    * 创建人
    */    
    private String createMan;
    /**
    * 创建时间
    */    
    private Date createTime;
    /**
    * 修改人
    */    
    private String updateMan;
    /**
    * 修改时间
    */    
    private Date updateTime;

        
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }
        
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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