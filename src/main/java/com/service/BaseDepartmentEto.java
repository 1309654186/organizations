package com.service;

import java.util.Date;
import java.io.Serializable;
import com.neusoft.mybatis.expand.expression.SimpleExpression;
import com.neusoft.mybatis.expand.expression.BaseQto;
import io.swagger.annotations.ApiModelProperty;

/**
 * 科室(BaseDepartment)修改类
 *
 * @author makejava
 * @since 2022-01-04 22:40:26
 */
public class BaseDepartmentEto implements Serializable {
    private static final long serialVersionUID = 484834872398264179L;
    @ApiModelProperty("科室编码")
    private String id;
    @ApiModelProperty("科室名称")
    private String name;
    @ApiModelProperty("排序码")
    private Integer sortNo;
    @ApiModelProperty("医院标识")
    private String hospitalId;
    @ApiModelProperty("拼音码")
    private String pinyinCode;
    @ApiModelProperty("创建时间")
    private Date createTime;
    @ApiModelProperty("创建人")
    private String createMan;
    @ApiModelProperty("修改时间")
    private Date updateTime;
    @ApiModelProperty("修改人")
    private String updateMan;
    @ApiModelProperty("备注")
    private String remark;
    @ApiModelProperty("是否有效")
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

}