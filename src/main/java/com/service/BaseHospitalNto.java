package com.service;

import java.util.Date;
import java.io.Serializable;

import com.neusoft.mybatis.expand.expression.SimpleExpression;
import com.neusoft.mybatis.expand.expression.BaseQto;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 院区(BaseHospital)添加类
 *
 * @author yufeng
 * @since 2021-07-27 13:12:31
 */
public class BaseHospitalNto implements Serializable {
    private static final long serialVersionUID = -76532063550798452L;
    @ApiModelProperty("编码")
    private String id;
    @NotBlank(message = "名称不能为空！")
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("拼音码")
    private String pinyinCode;
    @NotNull(message = "启用不能为空！")
    @ApiModelProperty("启用")
    private Boolean enabled;
    @NotNull(message = "创建人不能为空！")
    @ApiModelProperty("创建人")
    private String createMan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}