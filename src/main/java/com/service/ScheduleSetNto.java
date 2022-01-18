package com.service;

import java.util.Date;
import java.io.Serializable;

import com.neusoft.mybatis.expand.expression.SimpleExpression;
import com.neusoft.mybatis.expand.expression.BaseQto;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 班次(ScheduleSet)添加类
 *
 * @author makejava
 * @since 2022-01-13 20:29:21
 */
public class ScheduleSetNto implements Serializable {
    private static final long serialVersionUID = -69964975706209968L;
    @ApiModelProperty("班次名称")
    private String name;
    @ApiModelProperty("班次简称")
    private String abbreviation;
    @ApiModelProperty("备注")
    private String remark;
    @ApiModelProperty("开始时间")
    private Date startTime;
    @ApiModelProperty("结束时间")
    private Date endTime;
    @ApiModelProperty("持续时间")
    private Double lastTime;
    @ApiModelProperty("排序字段")
    private Integer sortNo;
    @ApiModelProperty("启用状态")
    private boolean enabled;
    @ApiModelProperty("是否是值班")
    private Integer isduty;
    @ApiModelProperty("创建人")
    private String createMan;
    @ApiModelProperty("创建时间")
    private Date createTime;
    @ApiModelProperty("最后修改人")
    private String updateMan;
    @ApiModelProperty("最后修改时间")
    private Date updateTime;

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