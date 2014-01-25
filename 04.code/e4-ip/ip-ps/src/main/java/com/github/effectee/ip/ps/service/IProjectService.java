package com.github.effectee.ip.ps.service;

import com.github.effectee.ip.ps.domain.Project;

public interface IProjectService extends ICRUDService<Project, String>{

    public Project get();


}
