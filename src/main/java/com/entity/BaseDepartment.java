package com.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.neusoft.mybatis.expand.mybatis.BaseEntity;

import java.util.Date;
import java.io.Serializable;

/**
 * 科室(BaseDepartment)实体类
 *
 * @author makejava
 * @since 2022-01-04 22:40:26
 */
public class BaseDepartment implements Serializable {
    private static final long serialVersionUID = -83807146135572827L;
    /**
    * 科室编码
    */
    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    /**
    * 科室名称
    */
    private String name;
    /**
    * 排序码
    */
    private Integer sortNo;
    /**
    * 医院标识
    */
    private String hospitalId;
    /**
    * 拼音码
    */
    private String pinyinCode;
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
    * 修改时间
    */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    /**
    * 修改人
    */
    private String updateMan;
    /**
    * 备注
    */
    private String remark;
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

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
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
        
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
        
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString(){
        return "BaseDepartment {" +
            "id : " + id + ", " +
            "name : " + name + ", " +
            "sortNo : " + sortNo + ", " +
            "hospitalId : " + hospitalId + ", " +
            "pinyinCode : " + pinyinCode + ", " +
            "createTime : " + createTime + ", " +
            "createMan : " + createMan + ", " +
            "updateTime : " + updateTime + ", " +
            "updateMan : " + updateMan + ", " +
            "remark : " + remark + ", " +
            "enabled : " + enabled + ", " +
        '}';
    }
}