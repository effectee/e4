package com.github.effectee.ip.gv.service.impl;

import com.github.effectee.ip.gv.dao.IEnumVarDao;
import com.github.effectee.ip.gv.domain.EnumVar;
import com.github.effectee.ip.gv.service.IEnumVarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnumVarServiceImpl implements IEnumVarService {

    @Autowired
    private IEnumVarDao dao;

    @Override
    public void create(EnumVar param) {

    }

    @Override
    public EnumVar get(String id) {
        return null;
    }

    @Override
    public void update(EnumVar param) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<EnumVar> list() {
        return null;
    }
}
