package com.github.e4.sv.entity;

import com.github.e4.ps.common.entity.BaseServiceEntity;

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
public class EnumItem extends BaseServiceEntity {

	/** 枚举字段名称 **/
	private String name;
	
	/** 显示顺序 **/
	private Integer showOrder;
	

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


	@Override
	public String toString() {
		return "EnumItem [id=" + getId() + ", code=" + getCode() + ", name=" + name
				+ ", showOrder=" + showOrder + ", createTime=" + getCreateTime()
				+ ", updateTime=" + getUpdateTime() + "]";
	}
	
	
}
