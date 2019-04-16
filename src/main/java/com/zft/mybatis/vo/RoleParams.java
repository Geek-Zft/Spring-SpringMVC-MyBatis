package com.zft.mybatis.vo;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * Description: RoleParams
 * @author  fengtan.zhang
 * @date    2019/4/12 0012 下午 5:27
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
@Alias("roleParams")
public class RoleParams implements Serializable{


    private static final long serialVersionUID = -6834313511587967692L;


    private String roleName;

    private String note;

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
