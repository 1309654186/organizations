package com.service;

import java.util.Date;
import java.io.Serializable;
import java.util.List;

/**
 * 院区(BaseHospital)返回类
 *
 * @author yufeng
 * @since 2021-07-27 13:12:32
 */
public class BaseHospitalTo implements Serializable {
    private static final long serialVersionUID = -85700040908332384L;
    /**
    * 编码
    */    
    private String id;
    /**
    * 名称
    */
    private String name;
    /**
    * 拼音码
    */    
    private String pinyinCode;
    /**
    * 启用
    */    
    private Boolean enabled;

    /**
    * 修改时间
    */    
    private Date updateTime;
    /**
    * 创建时间
    */    
    private Date createTime;
    /**
     * 创建人
     */
    private String createMan;

    /**
     * 科室
     */
    private List<BaseDepartmentTo> children;
    /**
     * 修改人
     */
    private String updateMan;
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
        
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
        
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<BaseDepartmentTo> getChildren() {
        return children;
    }

    public void setChildren(List<BaseDepartmentTo> children) {
        this.children = children;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPinyinCode() {
        return pinyinCode;
    }

    public void setPinyinCode(String pinyinCode) {
        this.pinyinCode = pinyinCode;
    }

    public String getCreateMan() {
        return createMan;
    }

    public void setCreateMan(String createMan) {
        this.createMan = createMan;
    }

    public String getUpdateMan() {
        return updateMan;
    }

    public void setUpdateMan(String updateMan) {
        this.updateMan = updateMan;
    }
}