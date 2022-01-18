package com.service;

import java.util.Date;
import java.io.Serializable;
import com.neusoft.mybatis.expand.expression.SimpleExpression;
import com.neusoft.mybatis.expand.expression.BaseQto;
import io.swagger.annotations.ApiModelProperty;
import com.neusoft.mybatis.expand.expression.typeexpression.*;
import java.util.Date;

/**
 * 班次(ScheduleSet)查询类
 *
 * @author makejava
 * @since 2022-01-13 20:29:21
 */
public class ScheduleSetQto extends BaseQto implements Serializable {
    private static final long serialVersionUID = 747758498245097963L;
    @ApiModelProperty("班次编码ID")
    private SimpleExpression<String> id = new StringSimpleExpression("id", SimpleExpression.eq);
    @ApiModelProperty("班次名称")
    private SimpleExpression<String> name = new StringSimpleExpression("name", SimpleExpression.eq);
    @ApiModelProperty("班次简称")
    private SimpleExpression<String> abbreviation = new StringSimpleExpression("abbreviation", SimpleExpression.eq);
    @ApiModelProperty("备注")
    private SimpleExpression<String> remark = new StringSimpleExpression("remark", SimpleExpression.eq);
    @ApiModelProperty("开始时间")
    private SimpleExpression<Date> startTime = new DateSimpleExpression("startTime", SimpleExpression.eq);
    @ApiModelProperty("结束时间")
    private SimpleExpression<Date> endTime = new DateSimpleExpression("endTime", SimpleExpression.eq);
    @ApiModelProperty("持续时间")
    private SimpleExpression<Double> lastTime = new DoubleSimpleExpression("lastTime", SimpleExpression.eq);
    @ApiModelProperty("排序字段")
    private SimpleExpression<Integer> sortNo = new IntegerSimpleExpression("sortNo", SimpleExpression.eq);
    @ApiModelProperty("启用状态")
    private SimpleExpression<Boolean> enabled = new BooleanSimpleExpression("enabled", SimpleExpression.eq);
    @ApiModelProperty("是否是值班")
    private SimpleExpression<Integer> isduty = new IntegerSimpleExpression("isduty", SimpleExpression.eq);
    @ApiModelProperty("创建人")
    private SimpleExpression<String> createMan = new StringSimpleExpression("createMan", SimpleExpression.eq);
    @ApiModelProperty("创建时间")
    private SimpleExpression<Date> createTime = new DateSimpleExpression("createTime", SimpleExpression.eq);
    @ApiModelProperty("最后修改人")
    private SimpleExpression<String> updateMan = new StringSimpleExpression("updateMan", SimpleExpression.eq);
    @ApiModelProperty("最后修改时间")
    private SimpleExpression<Date> updateTime = new DateSimpleExpression("updateTime", SimpleExpression.eq);

        
    public SimpleExpression<String> getId() {
        return id;
    }

    public void setId(String id) {
        this.id.setValue(id);
    }
        
    public SimpleExpression<String> getName() {
        return name;
    }

    public void setName(String name) {
        this.name.setValue(name);
    }
        
    public SimpleExpression<String> getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation.setValue(abbreviation);
    }
        
    public SimpleExpression<String> getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark.setValue(remark);
    }
        
    public SimpleExpression<Date> getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime.setValue(startTime);
    }
        
    public SimpleExpression<Date> getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime.setValue(endTime);
    }
        
    public SimpleExpression<Double> getLastTime() {
        return lastTime;
    }

    public void setLastTime(Double lastTime) {
        this.lastTime.setValue(lastTime);
    }
        
    public SimpleExpression<Integer> getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo.setValue(sortNo);
    }
        
    public SimpleExpression<Boolean> getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled.setValue(enabled);
    }

    public SimpleExpression<Integer> getIsduty() {
        return isduty;
    }

    public void setIsduty(Integer isduty) {
        this.isduty.setValue(isduty);
    }
        
    public SimpleExpression<String> getCreateMan() {
        return createMan;
    }

    public void setCreateMan(String createMan) {
        this.createMan.setValue(createMan);
    }
        
    public SimpleExpression<Date> getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime.setValue(createTime);
    }
        
    public SimpleExpression<String> getUpdateMan() {
        return updateMan;
    }

    public void setUpdateMan(String updateMan) {
        this.updateMan.setValue(updateMan);
    }
        
    public SimpleExpression<Date> getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime.setValue(updateTime);
    }

}