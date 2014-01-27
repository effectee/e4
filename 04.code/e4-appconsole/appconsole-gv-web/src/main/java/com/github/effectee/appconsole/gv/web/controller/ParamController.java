package com.github.effectee.appconsole.gv.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("e4/gv/param")
public class ParamController {

    @RequestMapping("index")
    public ModelAndView index(){

        ModelAndView mav = new ModelAndView("gv/param/index");

        return mav;
    }
}
