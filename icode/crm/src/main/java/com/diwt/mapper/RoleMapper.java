package com.diwt.mapper;

import com.diwt.pojo.Role;

import java.util.List;

public interface RoleMapper {
    List<Role> findByUserId(Integer userId);
}
