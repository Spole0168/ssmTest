package com.shang.dal.model;

import java.io.Serializable;
import java.util.Date;

public class RoleMenus implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * VARCHAR(40) 必填<br>
     * 主键
     */
    private String id;

    /**
     * VARCHAR(20)<br>
     * 角色编码
     */
    private String roleCode;

    /**
     * VARCHAR(20)<br>
     * 菜单编码
     */
    private String menuCode;

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
     * TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP] 必填<br>
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}