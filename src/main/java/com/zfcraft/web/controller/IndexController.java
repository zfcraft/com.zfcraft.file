package com.jtj.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chen
 * 2020/3/13.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "login1";
    }


}
