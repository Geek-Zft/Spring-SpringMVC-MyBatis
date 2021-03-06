package com.zft.mybatis.vo;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
/**
 * Description:
 * @author  fengtan.zhang
 * @date    2019/4/8 0008 下午 3:52
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
@Alias("role")
public class Role implements Serializable{

    private static final long serialVersionUID = 4460715385876535638L;

    private Long id;
    private String roleName;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
