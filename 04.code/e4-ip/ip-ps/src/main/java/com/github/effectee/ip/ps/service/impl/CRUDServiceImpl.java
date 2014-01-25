package com.github.effectee.ip.ps.service.impl;

import java.io.Serializable;
import java.util.List;

import com.github.effectee.dao.IGenericDao;
import com.github.effectee.ip.ps.service.ICRUDService;

public class CRUDServiceImpl<T, ID extends Serializable> implements ICRUDService<T, ID> {

	private IGenericDao<T,ID> dao;
	
	@Override
	public void create(T domain) {
		dao.create(domain);
	}

	@Override
	public T get(ID id) {
		return dao.find(id);
	}

	@Override
	public void delete(ID id) {
		dao.delete(id);
	}

	@Override
	public void update(T domain) {
		dao.update(domain);
	}

	@Override
	public List<T> list() {
		return dao.findAll();
	}

	public IGenericDao<T, ID> getDao() {
		return dao;
	}

	public void setDao(IGenericDao<T, ID> dao) {
		this.dao = dao;
	}
	
	

}
