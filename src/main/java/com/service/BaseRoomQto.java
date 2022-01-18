package com.service;

import java.util.Date;
import java.io.Serializable;
import com.neusoft.mybatis.expand.expression.SimpleExpression;
import com.neusoft.mybatis.expand.expression.BaseQto;
import io.swagger.annotations.ApiModelProperty;
import com.neusoft.mybatis.expand.expression.typeexpression.*;
import java.util.Date;

/**
 * (BaseRoom)查询类
 *
 * @author makejava
 * @since 2022-01-04 22:52:33
 */
public class BaseRoomQto extends BaseQto implements Serializable {
    private static final long serialVersionUID = -56899889511415160L;
    @ApiModelProperty("主键")
    private SimpleExpression<String> id = new StringSimpleExpression("id", SimpleExpression.eq);
    @ApiModelProperty("名称")
    private SimpleExpression<String> name = new StringSimpleExpression("name", SimpleExpression.eq);
    @ApiModelProperty("所属科室标识")
    private SimpleExpression<String> deptId = new StringSimpleExpression("deptId", SimpleExpression.eq);
    @ApiModelProperty("排序码")
    private SimpleExpression<Integer> sortNo = new IntegerSimpleExpression("sortNo", SimpleExpression.eq);
    @ApiModelProperty("备注")
    private SimpleExpression<String> remark = new StringSimpleExpression("remark", SimpleExpression.eq);
    @ApiModelProperty("拼音码")
    private SimpleExpression<String> pinyinCode = new StringSimpleExpression("pinyinCode", SimpleExpression.eq);
    @ApiModelProperty("创建时间")
    private SimpleExpression<Date> createTime = new DateSimpleExpression("createTime", SimpleExpression.eq);
    @ApiModelProperty("创建人")
    private SimpleExpression<String> createMan = new StringSimpleExpression("createMan", SimpleExpression.eq);
    @ApiModelProperty("修改时间")
    private SimpleExpression<Date> updateTime = new DateSimpleExpression("updateTime", SimpleExpression.eq);
    @ApiModelProperty("修改人")
    private SimpleExpression<String> updateMan = new StringSimpleExpression("updateMan", SimpleExpression.eq);
    @ApiModelProperty("容纳床位X")
    private SimpleExpression<Integer> roomX = new IntegerSimpleExpression("roomX", SimpleExpression.eq);
    @ApiModelProperty("容纳床位Y")
    private SimpleExpression<Integer> roomY = new IntegerSimpleExpression("roomY", SimpleExpression.eq);
    @ApiModelProperty("0正常，1领导，2传染病")
    private SimpleExpression<String> flag = new StringSimpleExpression("flag", SimpleExpression.eq);
    @ApiModelProperty("是否有效")
    private SimpleExpression<Boolean> enabled = new BooleanSimpleExpression("enabled", SimpleExpression.eq);

        
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
        
    public SimpleExpression<String> getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId.setValue(deptId);
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
        
    public SimpleExpression<String> getPinyinCode() {
        return pinyinCode;
    }

    public void setPinyinCode(String pinyinCode) {
        this.pinyinCode.setValue(pinyinCode);
    }
        
    public SimpleExpression<Date> getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime.setValue(createTime);
    }
        
    public SimpleExpression<String> getCreateMan() {
        return createMan;
    }

    public void setCreateMan(String createMan) {
        this.createMan.setValue(createMan);
    }
        
    public SimpleExpression<Date> getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime.setValue(updateTime);
    }
        
    public SimpleExpression<String> getUpdateMan() {
        return updateMan;
    }

    public void setUpdateMan(String updateMan) {
        this.updateMan.setValue(updateMan);
    }
        
    public SimpleExpression<Integer> getRoomX() {
        return roomX;
    }

    public void setRoomX(Integer roomX) {
        this.roomX.setValue(roomX);
    }
        
    public SimpleExpression<Integer> getRoomY() {
        return roomY;
    }

    public void setRoomY(Integer roomY) {
        this.roomY.setValue(roomY);
    }
        
    public SimpleExpression<String> getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag.setValue(flag);
    }
        
    public SimpleExpression<Boolean> getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled.setValue(enabled);
    }

}