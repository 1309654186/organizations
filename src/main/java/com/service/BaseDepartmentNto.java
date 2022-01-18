package com.service;

import java.util.Date;
import java.io.Serializable;

import com.neusoft.mybatis.expand.expression.SimpleExpression;
import com.neusoft.mybatis.expand.expression.BaseQto;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 科室(BaseDepartment)添加类
 *
 * @author makejava
 * @since 2022-01-04 22:40:26
 */
public class BaseDepartmentNto implements Serializable {
    private static final long serialVersionUID = -32361185975256347L;
    @NotBlank(message = "科室名称不能为空！")
    @ApiModelProperty("科室名称")
    private String name;
    @ApiModelProperty("排序码")
    private Integer sortNo;
    @NotBlank(message = "医院标识不能为空！")
    @ApiModelProperty("医院标识")
    private String hospitalId;
    @ApiModelProperty("拼音码")
    private String pinyinCode;
    @ApiModelProperty("创建人")
    private String createMan;
    @ApiModelProperty("修改人")
    private String updateMan;
    @ApiModelProperty("备注")
    private String remark;

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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}