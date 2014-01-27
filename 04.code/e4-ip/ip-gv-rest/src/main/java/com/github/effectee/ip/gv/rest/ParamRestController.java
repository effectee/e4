package com.github.effectee.ip.gv.rest;

import com.github.effectee.ip.gv.domain.Param;
import com.github.effectee.ip.gv.service.IParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("e4/gv/param")
public class ParamRestController {

    @Autowired
    private IParamService paramService;


    @RequestMapping(value="{key}",method=RequestMethod.GET)
    @ResponseBody
    public Param get(@PathVariable("key") String key){
        return paramService.get(key);
    }

    @RequestMapping(method= RequestMethod.POST)
    @ResponseBody
    public HttpStatus create(@RequestBody Param param){
        paramService.create(param);
        return HttpStatus.CREATED;
    }


    @RequestMapping(value="{key}", method=RequestMethod.PUT)
    public HttpStatus update(@PathVariable("key")String key, @RequestBody Param param){
        param.setKey(key);
        paramService.update(param);
        return HttpStatus.OK;

    }

    @RequestMapping(value="{key}", method=RequestMethod.DELETE)
    @ResponseBody
    public HttpStatus delete(@PathVariable("key") String key){
        paramService.delete(key);
        return HttpStatus.OK;
    }

    @RequestMapping(value="list",method=RequestMethod.GET)
    @ResponseBody
    public List<Param> list(){

        List<Param> params =  paramService.list();
        if(params == null){
            return new ArrayList<Param>(0);
        }else{
            return params;
        }
    }
}
