package com.zft.mybatis.vo;

import com.zft.mybatis.util.SexEnum;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
/**
 * Description: User实体类
 * @author  fengtan.zhang
 * @date    2019/4/11 0011 下午 5:16
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
@Alias("user")
public class User implements Serializable{
    private static final long serialVersionUID = -1443935075684783912L;

    private Long id;

    private String userName;

    private String password;

    private SexEnum sex;

    private String mobile;

    private String tel;

    private String email;

    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
