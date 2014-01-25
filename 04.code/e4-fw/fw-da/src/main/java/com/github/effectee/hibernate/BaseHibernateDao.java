package com.github.effectee.hibernate;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.metadata.ClassMetadata;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.effectee.core.util.GenericUtil;
import com.github.effectee.dao.IGenericDao;

@SuppressWarnings("unchecked")
public class BaseHibernateDao<T, ID extends Serializable> implements IGenericDao<T, ID> {

	@Autowired
	private SessionFactory sf;
	
	private Class<T> persistenctClass;
	
	private ClassMetadata persistentClassMetadata;
	
	public BaseHibernateDao(){
		getPersistentClass();
	}
	
	@Override
	public T find(ID id) {
		if(id == null){
			return null;
		}
		Object obj = getSession().get(getPersistentClass(), id);
		return (T)obj;
	}

	@Override
	public List<T> findAll() {
		List<T> list = query(createCriteria());
		return list;
	}

	@Override
	public void create(T domain) {
		getSession().save(domain);
	}

	@Override
	public void update(T domain) {
		getSession().update(domain);
	}

	@Override
	public void createOrUpdate(T domain) {
		getSession().saveOrUpdate(domain);
	}

	@Override
	public void delete(ID id) {
		T t = find(id);
		if(t == null){
			return;
		}
		getSession().delete(t);
	}
	
	private Class<T> getPersistentClass(){
		if(this.persistenctClass == null){
			Type[] types = GenericUtil.getGenericTypes(this.getClass());
			this.persistenctClass = (Class<T>)types[0];			
		}
		return this.persistenctClass;
	}
	
	private ClassMetadata getPersistentClassMetadata(){
		if(this.persistentClassMetadata == null){
			this.persistentClassMetadata = sf.getClassMetadata(getPersistentClass());
		}
		
		return this.persistentClassMetadata;
	}
	
	private Session getSession(){
		return this.sf.getCurrentSession();
	}
	
	protected DetachedCriteria createDetachedCriteria(){
		DetachedCriteria dc = DetachedCriteria.forClass(getPersistentClass());
		return dc;
	}
	
	protected Criteria createCriteria(){
		return getSession().createCriteria(getPersistentClass());
	}
	
	protected List<T> query(DetachedCriteria dc){
		Criteria  c = dc.getExecutableCriteria(getSession());
		return c.list();
	}
	
	protected List<T> query(Criteria c){
		return c.list();
	}
	
	protected void flush(){
		getSession().flush();
	}
	
}
