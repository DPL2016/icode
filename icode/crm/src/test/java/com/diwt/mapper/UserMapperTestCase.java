package com.diwt.mapper;

import com.diwt.pojo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

/**
 * Created by xiaod on 2016/8/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = UserMapperTestCase.class)
public class UserMapperTestCase {

    @Inject
    private UserMapper userMapper;

    @Test
    public void testFindAll(){
        User user = userMapper.findByTel("15500000000");
        System.out.println(user);
        Assert.assertNotNull(user);
    }
}
