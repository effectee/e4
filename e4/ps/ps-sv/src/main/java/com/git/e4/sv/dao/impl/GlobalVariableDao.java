package com.git.e4.sv.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.git.e4.da.HibernateBaseDao;
import com.git.e4.sv.entity.GlobalVariable;

@Repository
public class GlobalVariableDao extends HibernateBaseDao<GlobalVariable, String>{

	/**
	 * 根据编码查询全局变量
	 * 
	 * @param code 编码
	 * @return 全局变量
	 */
	public GlobalVariable findByCode(String code) {
		DetachedCriteria dc = createDetachedCriteria();
		dc.add(Restrictions.eq("code", code));
		List<GlobalVariable> gvList = query(dc);
		if(gvList == null || gvList.size() == 0){
			return null;
		}
		return gvList.get(1);
	}

}
