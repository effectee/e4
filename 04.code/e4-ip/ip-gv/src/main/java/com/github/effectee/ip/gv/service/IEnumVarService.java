package com.github.effectee.ip.gv.service;


import com.github.effectee.ip.gv.domain.EnumVar;

import java.util.List;

public interface IEnumVarService {

    public void create(EnumVar param);

    public EnumVar get(String id);

    public void update(EnumVar param);

    public void delete(String id);

    public List<EnumVar> list();

}
