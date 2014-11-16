package com.github.e4.sv.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.github.e4.da.hibernate.HibernateBaseDao;
import com.github.e4.sv.entity.EnumEntity;

@Repository
public class EnumEntityDao extends HibernateBaseDao<EnumEntity, String>{

	public EnumEntity findByCode(String code) {
		DetachedCriteria dc = createDetachedCriteria();
		dc.add(Restrictions.eq("code", code));
		List<EnumEntity> list = query(dc);
		if(list == null || list.size() == 0){
			return null;
		}
		return list.get(1);
	}

}
