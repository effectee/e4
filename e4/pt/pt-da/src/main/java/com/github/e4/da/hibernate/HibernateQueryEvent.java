package com.github.e4.da.hibernate;

import org.hibernate.Criteria;

/**
 * Hibernate查询事件
 *
 * Created by hubin0011@gmail.com on 2014/11/19.
 */
public class HibernateQueryEvent {

    enum QueryType{HQL,Criteria}

    private QueryType queryType;

    private String hql;

    private Criteria criteria;

    public QueryType getQueryType() {
        return queryType;
    }

    public void setQueryType(QueryType queryType) {
        this.queryType = queryType;
    }

    public String getHql() {
        return hql;
    }

    public void setHql(String hql) {
        this.hql = hql;
    }

    public Criteria getCriteria() {
        return criteria;
    }

    public void setCriteria(Criteria criteria) {
        this.criteria = criteria;
    }
}
