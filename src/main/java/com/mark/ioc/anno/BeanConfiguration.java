package com.mark.ioc.anno;

import com.mark.ioc.AccountDao;
import com.mark.ioc.AccountDaoImpl;
import com.mark.ioc.AccountService;
import com.mark.ioc.AccountServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lulei on 2018/1/26.
 */
@Configuration
public class BeanConfiguration {

    @Bean
    public AccountDao accountDao(){
        return new AccountDaoImpl();
    }

    @Bean
    public AccountService accountService(){
        AccountServiceImpl bean = new AccountServiceImpl();
        bean.setAccountDao(accountDao());
        return bean;
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        //名称必须BeanConfiguration中工程方法名称一致
        AccountService accountService= (AccountService) config.getBean("accountService");
        accountService.doSomething();
    }
}
