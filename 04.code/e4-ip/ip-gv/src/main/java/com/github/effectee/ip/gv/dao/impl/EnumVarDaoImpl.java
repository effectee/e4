package com.github.effectee.ip.gv.dao.impl;


import com.github.effectee.hibernate.BaseHibernateDao;
import com.github.effectee.ip.gv.dao.IEnumVarDao;
import com.github.effectee.ip.gv.domain.EnumVar;
import org.springframework.stereotype.Repository;

@Repository
public class EnumVarDaoImpl extends BaseHibernateDao<EnumVar,String> implements IEnumVarDao{

}
