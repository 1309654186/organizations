package com.service;

import java.util.Date;
import java.io.Serializable;

import com.neusoft.mybatis.expand.expression.SimpleExpression;
import com.neusoft.mybatis.expand.expression.BaseQto;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 字典类型(DictType)添加类
 *
 * @author makejava
 * @since 2022-01-07 17:00:34
 */
public class DictTypeNto implements Serializable {
    private static final long serialVersionUID = -93179905927036807L;
    @NotBlank(message = "编码不能为空！")
    @ApiModelProperty("编码")
    private String code;
    @NotBlank(message = "名称不能为空！")
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("排序码")
    private Integer sortNo;
    @ApiModelProperty("备注")
    private String remark;
    @ApiModelProperty("创建人")
    private String createMan;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}