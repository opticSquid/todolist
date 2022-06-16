package com.sb.tutorials.springboot.finalcourse.firstwebapp.controller;

import com.sb.tutorials.springboot.finalcourse.firstwebapp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginController(ModelMap model) {
        model.put("title","New Login");
        model.put("errHidden","none");
        return "loginForm";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPostController(@RequestParam String uname, @RequestParam String upass, ModelMap model) {
        if (loginService.validate(uname, upass)) {
            model.put("title","Welcome");
            //Making name persist between different requests by the same user using @SessionAttributes at class level and passing the value name
            model.put("name",uname);
            return "welcome";
        } else {
            model.put("errHidden","block");
            model.put("errMsg","Username or password incorrect");
            return "loginForm";
        }
    }
}
