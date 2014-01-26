package com.git.effectee.ip.gv.service;

import com.git.effectee.ip.gv.domain.Param;

import java.util.List;

public interface IParamService {

    public void create(Param param);

    public Param get(String id);

    public void update(Param param);

    public void delete(String id);

    public List<Param> list();
}
