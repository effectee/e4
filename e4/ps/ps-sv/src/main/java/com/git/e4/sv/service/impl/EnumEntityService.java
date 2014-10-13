package com.git.e4.sv.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.git.e4.sv.dao.impl.EnumEntityDao;
import com.git.e4.sv.entity.EnumEntity;
import com.git.e4.sv.entity.EnumItem;

@Service
public class EnumEntityService {
	
	@Autowired
	private EnumEntityDao enumEntityDao;
	
	public void createEnum(EnumEntity enumEntity){
		enumEntityDao.create(enumEntity);
	}

	public EnumEntity findById(String id){
		return enumEntityDao.find(id);
	}
	
	public EnumEntity findByCode(String code){
		return enumEntityDao.findByCode(code);
	}
	
	public void delete(EnumEntity enumEntity){
		enumEntityDao.delete(enumEntity);	
	}
	
	public void deleteById(String id){
		EnumEntity e = findById(id);
		delete(e);
	}
	
	public void deleteByCode(String code){
		EnumEntity e = findByCode(code);
		delete(e);
	}
	
	public void addEnumItem(EnumEntity enumEntity, EnumItem enumItem){
		List<EnumItem> list = enumEntity.getItems();
		for(EnumItem item : list){
			if(item.equals(enumItem)){
				return;
			}
		}
		list.add(enumItem);
		enumEntityDao.update(enumEntity);
	}
	
	public void removeEnumItem(EnumEntity enumEntity, EnumItem enumItem){
		enumEntity.getItems().remove(enumItem);
		enumEntityDao.update(enumEntity);
	}
	
	public void update(EnumEntity enumEntity){
		enumEntityDao.update(enumEntity);
	}
}
