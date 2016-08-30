package com.diwt.pojo;

import java.io.Serializable;

/**
 * Created by xiaod on 2016/8/30.
 */
public class Role implements Serializable {
    private static final long serialVersionUID = -3275418484778525459L;
    private Integer id;
    private String rolename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}
