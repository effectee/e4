package com.git.e4.sv.service;

import com.git.e4.sv.entity.GlobalVariable;

/**
 * 提供全局变量基础服务
 * 
 * @author hubin0011@gmail.com
 *
 */
public interface IGlobalVariableService {
	
	public void create(GlobalVariable gv);

	public void delete(GlobalVariable gv);
	
	public void delete(String id);
	
	public void modify(GlobalVariable gv);
	
	public GlobalVariable find(String id);
	
	public GlobalVariable findWithCode(String code);
}
