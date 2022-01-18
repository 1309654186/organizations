package com.service;

import java.util.Date;
import java.io.Serializable;
import com.neusoft.mybatis.expand.expression.SimpleExpression;
import com.neusoft.mybatis.expand.expression.BaseQto;
import io.swagger.annotations.ApiModelProperty;

/**
 * 字典类型(DictType)修改类
 *
 * @author makejava
 * @since 2022-01-07 17:00:35
 */
public class DictTypeEto implements Serializable {
    private static final long serialVersionUID = 270868811749681948L;
    @ApiModelProperty("编码")
    private String code;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("排序码")
    private Integer sortNo;
    @ApiModelProperty("备注")
    private String remark;
    @ApiModelProperty("修改人")
    private String updateMan;

        
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
        
    public String getUpdateMan() {
        return updateMan;
    }

    public void setUpdateMan(String updateMan) {
        this.updateMan = updateMan;
    }
        

}