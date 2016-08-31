package com.diwt.service;

import com.diwt.mapper.RoleMapper;
import com.diwt.mapper.UserMapper;
import com.diwt.pojo.Role;
import com.diwt.pojo.User;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class ShiroRealm extends AuthorizingRealm {
    private Logger logger = LoggerFactory.getLogger(ShiroRealm.class);
    @Inject
    private UserMapper userMapper;
    @Inject
    private RoleMapper roleMapper;
    /**
     * 验证用户是否具有权限
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        User shiroUser = (User) principalCollection.getPrimaryPrincipal();
        User user = userMapper.findByTel(shiroUser.getTel());
        if (user!=null){
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            List<Role> roleList = roleMapper.findByUserId(user.getId());
            for (Role role : roleList){
                info.addRole(role.getRolename());
            }
            return info;
        }
            return null;
    }

    /**
     * 验证账号密码是否正确
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String tel = token.getUsername();
        User user = userMapper.findByTel(tel);
        if (user != null) {
            if (user.getState().equals(User.USER_STATE_DISABLE)) {
                throw new LockedAccountException("账号已被禁用");
            }
            return new SimpleAuthenticationInfo(user,user.getPassword(),getName());
        } else {
            throw new UnknownAccountException("账号或密码错误");
        }


    }
}
