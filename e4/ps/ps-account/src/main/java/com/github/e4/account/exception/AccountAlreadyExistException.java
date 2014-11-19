package com.github.e4.account.exception;

import com.github.e4.core.exception.PlatformBaseException;

/**
 * 账户已经存在异常
 *
 * Created by howard.hb on 2014/11/19.
 */
public class AccountAlreadyExistException extends PlatformBaseException {

    public AccountAlreadyExistException(String errorCode, String msg) {
        super(errorCode, msg , null);
    }
}
