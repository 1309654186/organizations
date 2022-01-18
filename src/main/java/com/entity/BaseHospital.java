package com.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.neusoft.mybatis.expand.mybatis.BaseEntity;

import java.util.Date;
import java.io.Serializable;

/**
 * 院区(BaseHospital)实体类
 *
 * @author yufeng
 * @since 2021-07-26 10:11:59
 */
@TableName(value = "BASE_HOSPITAL")
public class BaseHospital implements Serializable {
    private static final long serialVersionUID = -87600885954039299L;
    /**
    * 编码
    */
    @TableId(type = IdType.ASSIGN_ID)
    private String Id;
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
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    /**
    * 创建时间
    */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    /**
     * 创建人
     */
    private String createMan;

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

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
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

    @Override
    public String toString(){
        return "BaseHospital {" +
            "name : " + name + ", " +
            "updateTime : " + updateTime + ", " +
            "createTime : " + createTime + ", " +
        '}';
    }
}