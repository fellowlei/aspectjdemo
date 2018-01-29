package com.mark;

import com.mark.debug.Debug;
import org.springframework.aop.framework.AopContext;

/**
 * Created by lulei on 2018/1/24.
 */
public class UserDaoImpl implements UserDao {

    public void show(String name,int age){
        System.out.println("UserDaoImpl.show name:"  + name + ",age:" + age);
    }

    @Debug
    public int addUser() {
        System.out.println("UserDaoImpl.addUser");
        return 666;
    }

    private void innerMethod() {
        System.out.println("private UserDaoImpl.innerMethod");
    }

    public void updateUser() {
        System.out.println("UserDaoImpl.updateUser");
    }

    public void deleteUser() {
        System.out.println("UserDaoImpl.deleteUser");
    }

    public void findUser() {
        System.out.println("UserDaoImpl.findUser");
    }


}
