package com.github.effectee.appconsole.ps.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.effectee.ip.ps.domain.Project;
import com.github.effectee.ip.ps.service.IProjectService;

@Controller
@RequestMapping("ps/project")
public class ProjectController {

	private final String JSP_FOLDER = "ps/";
	
	@Autowired
	private IProjectService projectService;
	
	@RequestMapping("index")
	public ModelAndView index(){
		ModelAndView mav = new ModelAndView(JSP_FOLDER + "index");
		
		return mav;
	}
	
	@RequestMapping(method=RequestMethod.POST, 
			consumes="application/json", produces="application/json")
	@ResponseBody
	public HttpStatus create(Project project){
		projectService.create(project);
		
		return HttpStatus.CREATED;
	}
	
	@RequestMapping(method=RequestMethod.PUT, 
			consumes="application/json", produces="application/json")
	@ResponseBody
	public HttpStatus update(Project project){
		projectService.update(project);
		
		return HttpStatus.OK;
	}
	
	@RequestMapping(value="{0}",method=RequestMethod.GET, 
			consumes="application/json", produces="application/json")
	@ResponseBody
	public Project get(@PathVariable String id){
		Project project = projectService.get(id);
		
		return project;
	}
	
	@RequestMapping(value="list",method=RequestMethod.GET, 
			produces="application/json")
	@ResponseBody
	public List<Project> list(){
	
		List<Project> projects =  projectService.findAll();
		return projects;
	}

	@RequestMapping(method=RequestMethod.DELETE, 
			consumes="application/json", produces="application/json")
	@ResponseBody
	public HttpStatus delete(String id){
		projectService.delete(id);
		return HttpStatus.OK;
	}
}
