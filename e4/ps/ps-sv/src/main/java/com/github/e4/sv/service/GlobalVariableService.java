package com.github.e4.sv.service;

import com.github.e4.ps.common.exception.CodeExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.e4.sv.dao.GlobalVariableDao;
import com.github.e4.sv.entity.GlobalVariable;

@Service
public class GlobalVariableService{
	
	@Autowired
	private GlobalVariableDao gvDao;

	public void create(GlobalVariable gv) {
		GlobalVariable existGv = findByCode(gv.getCode());
		if(existGv == null){
			gvDao.create(gv);
		}else{
			throw new CodeExistException("EP01001", "创建全局变量失败。",GlobalVariable.class, gv.getCode());
		}

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
