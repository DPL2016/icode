package com.diwt.mapper;

import com.diwt.pojo.User;

import java.util.List;

/**
 * Created by xiaod on 2016/8/30.
 */
public interface UserMapper {
    List<User> findAll();

    User findByTel(String tel);
}
