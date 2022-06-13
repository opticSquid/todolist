package com.sb.tutorials.springboot.finalcourse.firstwebapp.controller;

import com.sb.tutorials.springboot.finalcourse.firstwebapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.Objects;

@Controller
@SessionAttributes("name")
public class TodoController {
    @Autowired
    TodoService todoService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listTodos(ModelMap model) {
        //Getting the value of attribute name from session which was passed to session from LoginController and got here by @SessionAttributes("name") annotation.
        //I'm getting the value from model here.
        String user = (String) model.get("name");
        System.out.println("user name: "+user);
        model.put("todos", todoService.retrieveTodos(user));
        return "list-todos";
    }

    @RequestMapping(value = "/addTodos", method = RequestMethod.GET)
    public String addTodos() {
        return "add-todos";
    }

    @RequestMapping(value = "/addTodos", method = RequestMethod.POST)
    public String addPostTodos(@RequestParam String desc, @RequestParam String targetDate, @RequestParam(required = false) String isDone, ModelMap model) {
        LocalDate date = LocalDate.parse(targetDate);
        boolean checked = Objects.equals(isDone, "on") ;
        todoService.addTodo((String) model.get("name"), desc, date, checked);
        return "list-todos";
    }
}

