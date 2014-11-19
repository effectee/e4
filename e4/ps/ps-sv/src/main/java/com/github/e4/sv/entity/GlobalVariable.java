package com.github.e4.sv.entity;

import com.github.e4.ps.common.entity.BaseServiceEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/** 
 * 系统全局变量
 * 
 * @author hubin0011@gmail.com
 *
 */
@Entity
@Table(name="T_E4_SV_GLOABL_VARIABLE")
public class GlobalVariable extends BaseServiceEntity{

	/** 全局变量名称 **/
	private String name;
	
	/** 全局变量值 **/
	private String value;

	/**
	 * 取得全局变量名称
	 * @return 全局变量名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置全局变量名称
	 * @param name 全局变量名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 取得全局变量值
	 * @return 全局变量值
	 */
	public String getValue() {
		return value;
	}

	/**
	 * 设置全局变量值
	 * @param value 全局变量值
	 */
	public void setValue(String value) {
		this.value = value;
	}


	@Override
	public String toString() {
		return "GlobalVariable [id=" + getId() + ", code=" + getCode() + ", name=" + name
				+ ", value=" + value + ", createTime=" + getCreateTime()
				+ ", updateTime=" + getUpdateTime() + "]";
	}


}
