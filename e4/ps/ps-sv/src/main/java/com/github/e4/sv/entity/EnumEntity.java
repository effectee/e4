package com.github.e4.sv.entity;

import com.github.e4.ps.common.entity.BaseServiceEntity;

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
public class EnumEntity extends BaseServiceEntity {
	
	/** 枚举类型名称 **/
	private String name;
	
	/** 枚举字段列表**/
	private List<EnumItem> items = new ArrayList<EnumItem>();

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
	public String toString() {
		return "EnumEntity [id=" + getId() + ", code=" + getCode() + ", name=" + name
				+ ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime()
				+ ", items=" + items + "]";
	}
	
	

}
