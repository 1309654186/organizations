package com.service;

import java.util.Date;
import java.io.Serializable;

import com.neusoft.mybatis.expand.expression.SimpleExpression;
import com.neusoft.mybatis.expand.expression.BaseQto;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * (BaseRoom)添加类
 *
 * @author makejava
 * @since 2022-01-04 22:52:32
 */
public class BaseRoomNto implements Serializable {
    private static final long serialVersionUID = -28350487908826348L;
    @NotBlank(message = "名称不能为空！")
    @ApiModelProperty("名称")
    private String name;
    @NotBlank(message = "所属科室标识不能为空！")
    @ApiModelProperty("所属科室标识")
    private String deptId;
    @ApiModelProperty("排序码")
    private Integer sortNo;
    @ApiModelProperty("备注")
    private String remark;
    @ApiModelProperty("拼音码")
    private String pinyinCode;
    @ApiModelProperty("创建人")
    private String createMan;
    @ApiModelProperty("容纳床位X")
    private Integer roomX;
    @ApiModelProperty("容纳床位Y")
    private Integer roomY;
    @ApiModelProperty("0正常，1领导，2传染病")
    private String flag;
    @ApiModelProperty("是否有效")
    private Boolean enabled;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
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

    public Integer getRoomX() {
        return roomX;
    }

    public void setRoomX(Integer roomX) {
        this.roomX = roomX;
    }

    public Integer getRoomY() {
        return roomY;
    }

    public void setRoomY(Integer roomY) {
        this.roomY = roomY;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

}