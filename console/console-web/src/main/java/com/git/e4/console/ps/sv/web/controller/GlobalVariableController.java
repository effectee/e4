package com.git.e4.console.ps.sv.web.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("ps/sv/gv")
//TODO:考虑抽象出Controller基类。提供功能：basejspPath，CRUD默认页面和处理
public class GlobalVariableController {
	
	private static final String BASE_JSP_PATH = "ps/sv/gv";
	
	public ModelAndView index(){
		return null;
	}
	
	public ModelAndView doQuery(){
		return null;
	}
	
	public ModelAndView showCreate(){
		return null;
	}
	
	public ModelAndView doCreate(){
		return null;
	}
	
	public Map<String,Object> doDelete(){
		return null;
	}

	public ModelAndView showUpdate(){
		return null;
	}
	
	public ModelAndView doUpdate(){
		return null;
	}
	
	
	
}
