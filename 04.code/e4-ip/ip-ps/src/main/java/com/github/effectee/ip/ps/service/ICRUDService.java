package com.github.effectee.ip.ps.service;

import java.io.Serializable;
import java.util.List;

public interface ICRUDService <T, ID extends Serializable>{

	public void create(T domain);
	
	public T get(ID id);
	
	public void delete(ID id);
	
	public void update(T domain);
	
	public List<T> list();
	
}
