package com.github.e4.sv.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 枚举类型
 * 
 * @author hubin0011@gmail.com
 *
 */
@Entity
@Table(name="T_E4_SV_ENUM_ENTITY")
public class EnumEntity {
	
	/** 枚举类型ID **/
	private String id;
	
	/** 枚举类型编码 **/
	private String code;
	
	/** 枚举类型名称 **/
	private String name;
	
	/** 创建时间 **/
	private Date createTime;
	
	/** 修改时间 **/
	private Date moidfyTime;

	
	/** 枚举字段列表**/
	private List<EnumItem> items = new ArrayList<EnumItem>();

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

	public List<EnumItem> getItems() {
		return items;
	}

	public void setItems(List<EnumItem> items) {
		this.items = items;
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
		EnumEntity other = (EnumEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EnumEntity [id=" + id + ", code=" + code + ", name=" + name
				+ ", createTime=" + createTime + ", moidfyTime=" + moidfyTime
				+ ", items=" + items + "]";
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
	
	

}
