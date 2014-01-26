package com.git.effectee.ip.gv.service.impl;

import com.git.effectee.ip.gv.dao.IParamDao;
import com.git.effectee.ip.gv.domain.Param;
import com.git.effectee.ip.gv.service.IParamService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ParamServiceImpl implements IParamService {

    @Autowired
    private IParamDao paramDao;

    @Override
    public void create(Param param) {
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
