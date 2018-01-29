package com.mark;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lulei on 2018/1/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:aop.xml")
public class UserDaoTest {
    @Autowired
    UserDao userDao;

    @Test
    public void aspectJTest(){
//        userDao.addUser();
        userDao.deleteUser();
//        userDao.show("mark",18);
    }
}
