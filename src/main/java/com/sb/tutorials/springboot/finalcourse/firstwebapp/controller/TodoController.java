package com.sb.tutorials.springboot.finalcourse.firstwebapp.controller;

import com.sb.tutorials.springboot.finalcourse.firstwebapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {
    @Autowired
    TodoService todoService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listTodos(ModelMap model) {
        model.put("todos", todoService.retrieveTodos("in28minutes"));
        return "list-todos";
    }
}
