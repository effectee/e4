package com.github.effectee.ip.gv.service.impl;

import com.github.effectee.ip.gv.dao.IParamDao;
import com.github.effectee.ip.gv.domain.Param;
import com.github.effectee.ip.gv.exception.DomainAlreadyExistException;
import com.github.effectee.ip.gv.exception.NullPrimaryKeyException;
import com.github.effectee.ip.gv.service.IParamService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParamServiceImpl implements IParamService {

    @Autowired
    private IParamDao paramDao;

    @Override
    public void create(Param param) {
        if(StringUtils.isBlank(param.getKey())){
            throw new NullPrimaryKeyException();
        }
        if(get(param.getKey()) != null){
            throw new DomainAlreadyExistException();
        }
        paramDao.create(param);
    }

    @Override
    public Param get(String id) {
        return paramDao.find(id);
    }

    @Override
    public void update(Param param) {
        paramDao.update(param);
    }

    @Override
    public void delete(String id) {
        paramDao.delete(id);
    }

    @Override
    public List<Param> list() {
        return paramDao.findAll();
    }
}
