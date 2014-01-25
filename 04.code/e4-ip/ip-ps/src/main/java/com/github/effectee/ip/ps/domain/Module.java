package com.github.effectee.ip.ps.domain;

import java.util.List;

public class Module extends PSItem{

	private boolean visible = true;
	
	private List<Module> subModules;
	
	private List<Function> subFunctions;
	
	public Module(){
		setItemType(PSItemType.MODULE);
	}

	public List<Module> getSubModules() {
		return subModules;
	}

	public void setSubModules(List<Module> subModules) {
		this.subModules = subModules;
	}

	public List<Function> getSubFunctions() {
		return subFunctions;
	}

	public void setSubFunctions(List<Function> subFunctions) {
		this.subFunctions = subFunctions;
	}

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }


}
