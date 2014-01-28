package com.github.effectee.ip.gv.rest.controller;

import com.github.effectee.ip.gv.domain.EnumVar;
import com.github.effectee.ip.gv.domain.Param;
import com.github.effectee.ip.gv.service.IEnumVarService;
import com.github.effectee.ip.gv.service.IParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("e4/gv/enum")
public class EnumVarRestController {

    @Autowired
    private IEnumVarService enumVarService;


    @RequestMapping(value="{key}",method=RequestMethod.GET)
    @ResponseBody
    public EnumVar get(@PathVariable("key") String key){
        return enumVarService.get(key);
    }

    @RequestMapping(method= RequestMethod.POST)
    @ResponseBody
    public HttpStatus create(@RequestBody EnumVar enumVar){
        enumVarService.create(enumVar);
        return HttpStatus.CREATED;
    }


    @RequestMapping(value="{key}", method=RequestMethod.PUT)
    public HttpStatus update(@PathVariable("key")String key, @RequestBody EnumVar enumVar){
        enumVar.setKey(key);
        enumVarService.update(enumVar);
        return HttpStatus.OK;

    }

    @RequestMapping(value="{key}", method=RequestMethod.DELETE)
    @ResponseBody
    public HttpStatus delete(@PathVariable("key") String key){
        enumVarService.delete(key);
        return HttpStatus.OK;
    }

    @RequestMapping(value="list",method=RequestMethod.GET)
    @ResponseBody
    public List<EnumVar> list(){

        List<EnumVar> enumVars =  enumVarService.list();
        if(enumVars == null){
            return new ArrayList<EnumVar>(0);
        }else{
            return enumVars;
        }
    }
}
