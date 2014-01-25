package com.github.effectee.ip.ps.service.impl;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import com.github.effectee.ip.ps.domain.Project;
import com.github.effectee.ip.ps.service.IProjectService;

import java.util.List;

@Service
public class ProjectServiceImpl extends CRUDServiceImpl<Project, String> implements IProjectService {


    @Override
    public void create(Project project) {
        if(get() != null){
            //TODO:已经有工程时则抛出异常。
        }else{
            super.create(project);
        }

    }


    @Override
    public Project get() {
        List<Project> projectList = list();
        if(projectList == null || projectList.isEmpty()){
            return null;
        }else{
            return projectList.get(0);
        }
    }
}
