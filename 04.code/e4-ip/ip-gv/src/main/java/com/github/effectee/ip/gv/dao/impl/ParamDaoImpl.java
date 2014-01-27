package com.github.effectee.ip.gv.dao.impl;

import com.github.effectee.ip.gv.dao.IParamDao;
import com.github.effectee.ip.gv.domain.Param;
import com.github.effectee.hibernate.BaseHibernateDao;
import org.springframework.stereotype.Repository;

@Repository
public class ParamDaoImpl extends BaseHibernateDao<Param,String> implements IParamDao{
}
