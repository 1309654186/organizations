package com.service;

import java.util.Date;
import java.io.Serializable;

/**
 * (BaseRoom)返回类
 *
 * @author makejava
 * @since 2022-01-04 22:52:33
 */
public class BaseRoomTo implements Serializable {
    private static final long serialVersionUID = 435982713300201436L;
    /**
    * 主键
    */    
    private String id;
    /**
    * 名称
    */    
    private String name;
    /**
    * 所属科室标识
    */    
    private String deptId;
    /**
    * 排序码
    */    
    private Integer sortNo;
    /**
    * 备注
    */    
    private String remark;
    /**
    * 拼音码
    */    
    private String pinyinCode;
    /**
    * 创建时间
    */    
    private Date createTime;
    /**
    * 创建人
    */    
    private String createMan;
    /**
    * 修改时间
    */    
    private Date updateTime;
    /**
    * 修改人
    */    
    private String updateMan;
    /**
    * 容纳床位X
    */    
    private Integer roomX;
    /**
    * 容纳床位Y
    */    
    private Integer roomY;
    /**
    * 0正常，1领导，2传染病
    */    
    private String flag;
    /**
    * 是否有效
    */    
    private Boolean enabled;

        
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
        
    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
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
        
    public String getPinyinCode() {
        return pinyinCode;
    }

    public void setPinyinCode(String pinyinCode) {
        this.pinyinCode = pinyinCode;
    }
        
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
        
    public String getCreateMan() {
        return createMan;
    }

    public void setCreateMan(String createMan) {
        this.createMan = createMan;
    }
        
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
        
    public String getUpdateMan() {
        return updateMan;
    }

    public void setUpdateMan(String updateMan) {
        this.updateMan = updateMan;
    }
        
    public Integer getRoomX() {
        return roomX;
    }

    public void setRoomX(Integer roomX) {
        this.roomX = roomX;
    }
        
    public Integer getRoomY() {
        return roomY;
    }

    public void setRoomY(Integer roomY) {
        this.roomY = roomY;
    }
        
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
        
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

}