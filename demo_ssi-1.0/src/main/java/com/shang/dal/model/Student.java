package com.shang.dal.model;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * VARCHAR(40) 必填<br>
     * 主键
     */
    private String id;

    /**
     * VARCHAR(20)<br>
     * 姓名
     */
    private String name;

    /**
     * VARCHAR(4)<br>
     * 性别
     */
    private String sex;

    /**
     * INTEGER(10) 默认值[0]<br>
     * 年龄
     */
    private Integer age;

    /**
     * CHAR(1) 默认值[0]<br>
     * 是否有效 0-有效，1-删除 
     */
    private String isValid;

    /**
     * VARCHAR(20)<br>
     * 创建者
     */
    private String creator;

    /**
     * TIMESTAMP(19)<br>
     * 创建时间
     */
    private Date createTime;

    /**
     * VARCHAR(20)<br>
     * 最后修改者
     */
    private String updator;

    /**
     * TIMESTAMP(19)<br>
     * 最后修改时间
     */
    private Date updateTime;

    /**
     * VARCHAR(40) 必填<br>
     * 获得 主键
     */
    public String getId() {
        return id;
    }

    /**
     * VARCHAR(40) 必填<br>
     * 设置 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * VARCHAR(4)<br>
     * 获得 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * VARCHAR(4)<br>
     * 设置 性别
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * INTEGER(10) 默认值[0]<br>
     * 获得 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * INTEGER(10) 默认值[0]<br>
     * 设置 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * CHAR(1) 默认值[0]<br>
     * 获得 是否有效 0-有效，1-删除 
     */
    public String getIsValid() {
        return isValid;
    }

    /**
     * CHAR(1) 默认值[0]<br>
     * 设置 是否有效 0-有效，1-删除 
     */
    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 创建者
     */
    public String getCreator() {
        return creator;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 创建者
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * TIMESTAMP(19)<br>
     * 获得 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * TIMESTAMP(19)<br>
     * 设置 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * VARCHAR(20)<br>
     * 获得 最后修改者
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 最后修改者
     */
    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
     * TIMESTAMP(19)<br>
     * 获得 最后修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * TIMESTAMP(19)<br>
     * 设置 最后修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}