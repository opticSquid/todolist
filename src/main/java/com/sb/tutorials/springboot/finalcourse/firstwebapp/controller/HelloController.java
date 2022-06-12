package com.sb.tutorials.springboot.finalcourse.firstwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String helloController() {
        return "welcome";
    }
}
