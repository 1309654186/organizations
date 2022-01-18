package com.service;

import java.util.Date;
import java.io.Serializable;
import com.neusoft.mybatis.expand.expression.SimpleExpression;
import com.neusoft.mybatis.expand.expression.BaseQto;
import io.swagger.annotations.ApiModelProperty;
import com.neusoft.mybatis.expand.expression.typeexpression.*;
import java.util.Date;

/**
 * 字典集合(DictList)查询类
 *
 * @author makejava
 * @since 2022-01-11 20:37:31
 */
public class DictListQto extends BaseQto implements Serializable {
    private static final long serialVersionUID = 671764825825789298L;
    @ApiModelProperty("主键")
    private SimpleExpression<String> id = new StringSimpleExpression("id", SimpleExpression.eq);
    @ApiModelProperty("字典类型")
    private SimpleExpression<String> type = new StringSimpleExpression("type", SimpleExpression.eq);
    @ApiModelProperty("科室标识")
    private SimpleExpression<String> deptId = new StringSimpleExpression("deptId", SimpleExpression.eq);
    @ApiModelProperty("编码")
    private SimpleExpression<String> code = new StringSimpleExpression("code", SimpleExpression.eq);
    @ApiModelProperty("名称")
    private SimpleExpression<String> name = new StringSimpleExpression("name", SimpleExpression.eq);
    @ApiModelProperty("简称")
    private SimpleExpression<String> abbreviation = new StringSimpleExpression("abbreviation", SimpleExpression.eq);
    @ApiModelProperty("拼音码")
    private SimpleExpression<String> pinyinCode = new StringSimpleExpression("pinyinCode", SimpleExpression.eq);
    @ApiModelProperty("五笔码")
    private SimpleExpression<String> wbCode = new StringSimpleExpression("wbCode", SimpleExpression.eq);
    @ApiModelProperty("单位")
    private SimpleExpression<String> unit = new StringSimpleExpression("unit", SimpleExpression.eq);
    @ApiModelProperty("启用")
    private SimpleExpression<Boolean> enabled = new BooleanSimpleExpression("enabled", SimpleExpression.eq);
    @ApiModelProperty("颜色")
    private SimpleExpression<String> color = new StringSimpleExpression("color", SimpleExpression.eq);
    @ApiModelProperty("排序码")
    private SimpleExpression<Integer> sortNo = new IntegerSimpleExpression("sortNo", SimpleExpression.eq);
    @ApiModelProperty("备注")
    private SimpleExpression<String> remark = new StringSimpleExpression("remark", SimpleExpression.eq);
    @ApiModelProperty("创建人")
    private SimpleExpression<String> createMan = new StringSimpleExpression("createMan", SimpleExpression.eq);
    @ApiModelProperty("创建时间")
    private SimpleExpression<Date> createTime = new DateSimpleExpression("createTime", SimpleExpression.eq);
    @ApiModelProperty("修改人")
    private SimpleExpression<String> updateMan = new StringSimpleExpression("updateMan", SimpleExpression.eq);
    @ApiModelProperty("修改时间")
    private SimpleExpression<Date> updateTime = new DateSimpleExpression("updateTime", SimpleExpression.eq);

        
    public SimpleExpression<String> getId() {
        return id;
    }

    public void setId(String id) {
        this.id.setValue(id);
    }
        
    public SimpleExpression<String> getType() {
        return type;
    }

    public void setType(String type) {
        this.type.setValue(type);
    }
        
    public SimpleExpression<String> getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId.setValue(deptId);
    }
        
    public SimpleExpression<String> getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code.setValue(code);
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
        
    public SimpleExpression<String> getPinyinCode() {
        return pinyinCode;
    }

    public void setPinyinCode(String pinyinCode) {
        this.pinyinCode.setValue(pinyinCode);
    }
        
    public SimpleExpression<String> getWbCode() {
        return wbCode;
    }

    public void setWbCode(String wbCode) {
        this.wbCode.setValue(wbCode);
    }
        
    public SimpleExpression<String> getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit.setValue(unit);
    }
        
    public SimpleExpression<Boolean> getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled.setValue(enabled);
    }
        
    public SimpleExpression<String> getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color.setValue(color);
    }
        
    public SimpleExpression<Integer> getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo.setValue(sortNo);
    }
        
    public SimpleExpression<String> getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark.setValue(remark);
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