package com.git.e4.sv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.git.e4.sv.dao.impl.GlobalVariableDao;
import com.git.e4.sv.entity.GlobalVariable;

@Service
public class GlobalVariableService{
	
	@Autowired
	private GlobalVariableDao gvDao;

	public void create(GlobalVariable gv) {
		gvDao.create(gv);

	}

	public void delete(GlobalVariable gv) {
		gvDao.delete(gv);
	}

	public void delete(String id) {
		gvDao.deleteById(id);
	}

	public void update(GlobalVariable gv) {
		gvDao.update(gv);
	}

	public GlobalVariable find(String id) {
		return gvDao.find(id);
	}

	public GlobalVariable findByCode(String code) {
		return gvDao.findByCode(code);
	}
}
