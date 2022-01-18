package com.service;

import java.util.Date;
import java.io.Serializable;
import com.neusoft.mybatis.expand.expression.SimpleExpression;
import com.neusoft.mybatis.expand.expression.BaseQto;
import io.swagger.annotations.ApiModelProperty;
import com.neusoft.mybatis.expand.expression.typeexpression.*;
import java.util.Date;

/**
 * 字典类型(DictType)查询类
 *
 * @author makejava
 * @since 2022-01-07 17:00:35
 */
public class DictTypeQto extends BaseQto implements Serializable {
    private static final long serialVersionUID = -48641255347026729L;
    @ApiModelProperty("编码")
    private SimpleExpression<String> code = new StringSimpleExpression("code", SimpleExpression.eq);
    @ApiModelProperty("名称")
    private SimpleExpression<String> name = new StringSimpleExpression("name", SimpleExpression.eq);
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