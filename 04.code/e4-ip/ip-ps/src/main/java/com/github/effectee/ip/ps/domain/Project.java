package com.github.effectee.ip.ps.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="T_E4_PS_PROJECT")
public class Project extends PSItem{
	
	@Column
	private String title;
	
	@Column(name="SUB_TITLE")
	private String subTitle;
	
	private List<Module> subModule;
	
	public Project(){
		setItemType(PSItemType.PROJECT);
	}

	public List<Module> getSubModule() {
		return subModule;
	}

	public void setSubModule(List<Module> subModule) {
		this.subModule = subModule;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	
}
