package com.git.e4.sv.entity;

import java.util.Date;

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
public class GlobalVariable {
	/** ID **/
	public String id;
	
	/** 全局变量编号 **/
	private String code;
	
	/** 全局变量名称 **/
	private String name;
	
	/** 全局变量值 **/
	private String value;
	
	/** 全局变量创建时间 **/
	private Date createTime;

	/** 全局变量修改时间 **/
	private Date updateTime;

    /** 全局变量类型 **/
    private EnumItem type;

	/**
	 * 取得ID
	 * @return ID
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置ID
	 * @param id ID
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 取得全局变量编号
	 * @return 全局变量编号
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 设置全局编号
	 * @param code 全局编号
	 */
	public void setCode(String code) {
		this.code = code;
	}

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

	/**
	 * 取得创建时间
	 * @return 创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置创建时间
	 * @param createTime 创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 取得更新时间
	 * @return 更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置更新时间
	 * @param createTime 更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "GlobalVariable [id=" + id + ", code=" + code + ", name=" + name
				+ ", value=" + value + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}
	
	/**
	 * ID的hashCode
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * 根据ID进行比较
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GlobalVariable other = (GlobalVariable) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
