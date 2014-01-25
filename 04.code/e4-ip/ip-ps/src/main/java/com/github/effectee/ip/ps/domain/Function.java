package com.github.effectee.ip.ps.domain;

import java.util.List;

public class Function extends PSExecutableItem{

    private List<FunctionPoint> subFuntionPoints;

    public Function(){
        setItemType(PSItemType.FUNCTION);
    }

    public List<FunctionPoint> getSubFuntionPoints() {
        return subFuntionPoints;
    }

    public void setSubFuntionPoints(List<FunctionPoint> subFuntionPoints) {
        this.subFuntionPoints = subFuntionPoints;
    }


}
