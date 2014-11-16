package com.github.e4.sv.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 枚举字段信息
 * 
 * @author hubin0011@gmail.com
 *
 */
@Entity
@Table(name="T_E4_SV_ENUM_ITEM")
public class EnumItem {

	/** 枚举字段ID **/
	private String id;
	
	/** 枚举字段编码 **/
	private String code;
	
	/** 枚举字段名称 **/
	private String name;
	
	/** 显示顺序 **/
	private Integer showOrder;
	
	/** 创建时间 **/
	private Date createTime;
	
	/** 修改时间 **/
	private Date moidfyTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getShowOrder() {
		return showOrder;
	}

	public void setShowOrder(Integer showOrder) {
		this.showOrder = showOrder;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getMoidfyTime() {
		return moidfyTime;
	}

	public void setMoidfyTime(Date moidfyTime) {
		this.moidfyTime = moidfyTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnumItem other = (EnumItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EnumItem [id=" + id + ", code=" + code + ", name=" + name
				+ ", showOrder=" + showOrder + ", createTime=" + createTime
				+ ", moidfyTime=" + moidfyTime + "]";
	}
	
	
}
