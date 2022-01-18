package com.service;

import java.util.Date;
import java.io.Serializable;

import com.neusoft.mybatis.expand.expression.SimpleExpression;
import com.neusoft.mybatis.expand.expression.BaseQto;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 字典集合(DictList)添加类
 *
 * @author makejava
 * @since 2022-01-11 20:37:28
 */
public class DictListNto implements Serializable {
    private static final long serialVersionUID = -63316013288170824L;
    @NotBlank(message = "字典类型不能为空！")
    @ApiModelProperty("字典类型")
    private String type;
    @ApiModelProperty("科室标识")
    private String deptId;
    @NotBlank(message = "编码不能为空！")
    @ApiModelProperty("编码")
    private String code;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("简称")
    private String abbreviation;
    @ApiModelProperty("拼音码")
    private String pinyinCode;
    @ApiModelProperty("五笔码")
    private String wbCode;
    @ApiModelProperty("单位")
    private String unit;
    @ApiModelProperty("启用")
    private boolean enabled;
    @ApiModelProperty("颜色")
    private String color;
    @ApiModelProperty("排序码")
    private Integer sortNo;
    @ApiModelProperty("备注")
    private String remark;
    @ApiModelProperty("创建人")
    private String createMan;
    @ApiModelProperty("创建时间")
    private Date createTime;
    @ApiModelProperty("修改人")
    private String updateMan;
    @ApiModelProperty("修改时间")
    private Date updateTime;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

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

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getPinyinCode() {
        return pinyinCode;
    }

    public void setPinyinCode(String pinyinCode) {
        this.pinyinCode = pinyinCode;
    }

    public String getWbCode() {
        return wbCode;
    }

    public void setWbCode(String wbCode) {
        this.wbCode = wbCode;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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