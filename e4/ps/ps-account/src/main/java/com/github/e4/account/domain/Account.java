package com.github.e4.account.domain;

import com.github.e4.ps.common.entity.BaseServiceEntity;

/**
 * 账户实体类
 *
 * Created by hubin0011@gmail.com on 2014/11/19.
 */
public class Account extends BaseServiceEntity{

    private String email;

    private String pwd;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
