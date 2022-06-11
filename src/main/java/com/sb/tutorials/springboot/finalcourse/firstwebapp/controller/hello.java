package com.sb.tutorials.springboot.finalcourse.firstwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class hello {
    @RequestMapping("/hello")
    public String helloController(@RequestParam String k, ModelMap model) {
        System.out.println("k is="+k);
        model.put("name",k);
        return "hello";
    }
}
