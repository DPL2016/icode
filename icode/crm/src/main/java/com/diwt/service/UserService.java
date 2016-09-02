package com.diwt.service;

import com.diwt.mapper.RoleMapper;
import com.diwt.mapper.UerLogMapper;
import com.diwt.mapper.UserMapper;
import com.diwt.pojo.UserLog;
import com.diwt.util.ServletUtil;
import com.diwt.util.ShiroUtil;
import org.joda.time.DateTime;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class UserService {
    @Inject
    private UserMapper userMapper;
    @Inject
    private RoleMapper roleMapper;
    @Inject
    private UerLogMapper uerLogMapper;

    public void saveUserLogin(String ip) {
        UserLog userLog = new UserLog();
        userLog.setLoginip(ip);
        userLog.setUserid(ShiroUtil.getCurrentUserID());
        userLog.setLogintime(DateTime.now().toString("yyyy-MM-dd HH:mm"));
        uerLogMapper.save(userLog);
    }
}
