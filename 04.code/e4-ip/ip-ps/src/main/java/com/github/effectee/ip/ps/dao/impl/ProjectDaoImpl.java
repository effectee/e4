package com.github.effectee.ip.ps.dao.impl;

import org.springframework.stereotype.Repository;

import com.github.effectee.hibernate.BaseHibernateDao;
import com.github.effectee.ip.ps.dao.IProjectDao;
import com.github.effectee.ip.ps.domain.Project;

@Repository
public class ProjectDaoImpl extends BaseHibernateDao<Project, String> implements IProjectDao {

}
