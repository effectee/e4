package com.github.e4.account.service;

import com.github.e4.account.dao.AccountDao;
import com.github.e4.account.domain.Account;
import com.github.e4.account.exception.AccountAlreadyExistException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 账户实体服务
 *
 * Created by hubin0011@gmail.com on 2014/11/19.
 */
@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    public void create(Account account){
        if(StringUtils.isNotEmpty(account.getEmail())){
            Account existAccount = findByEmail(account.getEmail());
            if(existAccount != null){
                throw new AccountAlreadyExistException("EP02001", "创建账户失败。email已经存在：" + account.getEmail());
            }
        }

        accountDao.create(account);
    }

    public Account find(Long id){
        return accountDao.find(id);
    }

    public Account findByCode(String code){
        return accountDao.findByCode(code);
    }

    public Account findByEmail(String email){
        return accountDao.findByPropertyUnique("email",email);
    }

    public void update(Account account){
        if(StringUtils.isNotEmpty(account.getEmail())){
            Account existAccount = findByEmail(account.getEmail());
            if(existAccount != null && !existAccount.getId().equals(account.getId())){
                throw new AccountAlreadyExistException("EP02002", "更新账户失败。email已经存在：" + account.getEmail());
            }
        }
        accountDao.update(account);
    }

    public void delete(Account account){
        accountDao.delete(account);
    }

    public void deleteById(Long id){
        accountDao.deleteById(id);
    }

    public void deleteByCode(String code){
        Account account = findByCode(code);
        delete(account);
    }

    public void deleteByEmail(String email){
        Account account = findByEmail(email);
        delete(account);
    }

}
