package com.git.e4.da;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;

import com.git.e4.util.ReflectUtil;

/**
 * 基于Hibernate的通用DAO基类
 * @author hubin0011@gmail.com
 *
 * @param <T> 实体类型
 * @param <ID> 主键类型
 */
@SuppressWarnings("unchecked")
public abstract  class HibernateBaseDao <T, ID extends Serializable>{
	
	@Autowired
	protected SessionFactory sf;
	
	/** 实体类的具体类型 **/
	protected Class<T> entityClass;
	
	public HibernateBaseDao(){
		entityClass = getEntityClass();
	}
	
	public T find(final ID id) {
		if(id == null){
			return null;
		}
		Object obj = getSession().get(entityClass, id); 
		return (T)obj;
	}
	
	public  List<T> findByExample(T t){
		DetachedCriteria dc = createDetachedCriteria().add(Example.create(t));
		return query(dc);
	}
	
	public  void create(T t){
		getSession().save(t);
	}
	
	public  void update(T t){
		getSession().update(t);
	}
	
	public  void createOrUpdate(T t){
		getSession().saveOrUpdate(t);
	}
	
	public  void delete(T t){
		getSession().delete(t);
	}
	
	public  void deleteById(ID id){
		T t = find(id);
		delete(t);
	}
	
	public void flush(){
		getSession().flush();
	}
	
	protected DetachedCriteria createDetachedCriteria(){
		DetachedCriteria dc = DetachedCriteria.forClass(entityClass);
		return dc;
	}
	
	protected Criteria createCriteria(){
		return getSession().createCriteria(entityClass);
	}
	
	protected List<T> query(DetachedCriteria dc){
		Criteria  c = dc.getExecutableCriteria(getSession());
		return query(c);
	}
	
	protected List<T> query(Criteria c){
		List<T> list = c.list();
		return list;
	}
	
	/**
	 * 取得实体类的具体类型
	 */
	private Class<T> getEntityClass(){
		Type[] types = ReflectUtil.getGenericTypes(this.getClass());
		Class<T> clazz = (Class<T>)types[0];
		return clazz;
	}
	
	protected  Session getSession(){
		return sf.openSession();
	}
}
