package com.saosin.ui.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by saosin on 2018/8/27.
 */

@Controller
@RequestMapping("/commonui")
public class IndexController {

    @RequestMapping(value = "/simple.do",method = RequestMethod.POST)
    @ResponseBody
    public String init(){
        return "world";
    }
}
