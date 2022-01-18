package com.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.neusoft.mybatis.expand.mybatis.BaseEntity;

import java.util.Date;
import java.io.Serializable;

/**
 * 字典类型(DictType)实体类
 *
 * @author makejava
 * @since 2022-01-07 17:00:33
 */
public class DictType implements Serializable {
    private static final long serialVersionUID = 754455696122323589L;
    /**
    * 编码
    */
    @TableId(type = IdType.ASSIGN_ID)
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
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    /**
    * 修改人
    */
    private String updateMan;
    /**
    * 修改时间
    */
    @TableField(fill = FieldFill.INSERT_UPDATE)
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

    @Override
    public String toString(){
        return "DictType {" +
            "code : " + code + ", " +
            "name : " + name + ", " +
            "sortNo : " + sortNo + ", " +
            "remark : " + remark + ", " +
            "createMan : " + createMan + ", " +
            "createTime : " + createTime + ", " +
            "updateMan : " + updateMan + ", " +
            "updateTime : " + updateTime + ", " +
        '}';
    }
}