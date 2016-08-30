package com.diwt.pojo;

import java.io.Serializable;

/**
 * Created by xiaod on 2016/8/30.
 */
public class UserLog implements Serializable {
    private static final long serialVersionUID = -5041499623029301793L;
    private Integer id;
    private String logintime;
    private String loginip;
    private Integer userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogintime() {
        return logintime;
    }

    public void setLogintime(String logintime) {
        this.logintime = logintime;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}
