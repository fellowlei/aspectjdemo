package com.mark;

import com.mark.ioc.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lulei on 2018/1/26.
 */
public class AccountServiceTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc/ioc.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        accountService.doSomething();
    }
}
