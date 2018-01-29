package com.mark.ioc;

/**
 * Created by lulei on 2018/1/26.
 */
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void doSomething() {
        System.out.println("AccountServiceImpl.addAcount");
        accountDao.addAcount();
    }
}
