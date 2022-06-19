package com.sb.tutorials.springboot.finalcourse.firstwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller("error")
public class ErrorController {
    @ExceptionHandler(Exception.class)
    public ModelAndView handleException(HttpServletRequest request, Exception exception) {
        ModelAndView mv = new ModelAndView();
        //Only message goes through JSP others are to be stored in DB
        mv.addObject("message", exception.getMessage());
        mv.addObject("url", request.getRequestURL());
        mv.addObject("cause", exception.getCause());
        mv.addObject("stackTrace", exception.getStackTrace());
        mv.setViewName("error");
        return mv;
    }
}
