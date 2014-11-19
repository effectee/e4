package com.github.e4.ps.common.exception;

import com.github.e4.core.exception.PlatformBaseException;

/**
 * 编号已经存在异常
 * 发生在创建实体类时编号已经在数据库存在的场景
 *
 * Created by howard.hb on 2014/11/16.
 */
public class CodeAlreadyExistException extends PlatformBaseException{
    public CodeAlreadyExistException(String errorCode, String msg, Class entityClazz, Object codeValue) {
        super(errorCode, msg + "remark:编号已经存在。类：" + entityClazz.getName() + ",编号值：" + codeValue, null);
    }
}
