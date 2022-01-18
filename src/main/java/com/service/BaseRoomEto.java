package com.service;

import java.util.Date;
import java.io.Serializable;
import com.neusoft.mybatis.expand.expression.SimpleExpression;
import com.neusoft.mybatis.expand.expression.BaseQto;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;

/**
 * (BaseRoom)修改类
 *
 * @author makejava
 * @since 2022-01-04 22:52:33
 */
public class BaseRoomEto implements Serializable {
    private static final long serialVersionUID = -72458306326836753L;
    @NotBlank(message = "编码不能为空！")
    @ApiModelProperty("主键")
    private String id;
    @NotBlank(message = "名称不能为空！")
    @ApiModelProperty("名称")
    private String name;
    @NotBlank(message = "所属科室不能为空！")
    @ApiModelProperty("所属科室标识")
    private String deptId;
    @ApiModelProperty("排序码")
    private Integer sortNo;
    @ApiModelProperty("备注")
    private String remark;
    @ApiModelProperty("拼音码")
    private String pinyinCode;
    @ApiModelProperty("修改人")
    private String updateMan;
    @ApiModelProperty("容纳床位X")
    private Integer roomX;
    @ApiModelProperty("容纳床位Y")
    private Integer roomY;
    @ApiModelProperty("0正常，1领导，2传染病")
    private String flag;
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
        
    public String getUpdateMan() {
        return updateMan;
    }

    public void setUpdateMan(String updateMan) {
        this.updateMan = updateMan;
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