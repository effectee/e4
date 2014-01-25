package com.git.effectee.ip.ps.web.controller;

import com.github.effectee.ip.ps.domain.Project;
import com.github.effectee.ip.ps.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("e4/ps/project")
public class ProjectController {

    @Autowired
    private IProjectService projectService;

    @RequestMapping(method = RequestMethod.GET,
            produces= MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Project get(){
        return projectService.get();
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public HttpStatus create(Project project){
        projectService.create(project);
        return HttpStatus.CREATED;
    }

    @RequestMapping(method=RequestMethod.PUT,
        consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public HttpStatus update(Project project){
        projectService.update(project);
        return HttpStatus.OK;
    }

    @RequestMapping(value="{id}",method = RequestMethod.DELETE,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public HttpStatus delete(@PathVariable("id") String id){
        projectService.delete(id);
        return HttpStatus.OK;
    }
}
