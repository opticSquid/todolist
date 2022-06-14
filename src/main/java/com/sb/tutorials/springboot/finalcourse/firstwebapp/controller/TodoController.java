package com.sb.tutorials.springboot.finalcourse.firstwebapp.controller;

import com.sb.tutorials.springboot.finalcourse.firstwebapp.model.Todo;
import com.sb.tutorials.springboot.finalcourse.firstwebapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;
import java.util.Date;

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
        System.out.println("user name: " + user);
        model.put("todos", todoService.retrieveTodos(user));
        System.out.println("User todos:\n" + todoService.retrieveTodos(user));
        return "list-todos";
    }

    @RequestMapping(value = "/addTodos", method = RequestMethod.GET)
    public String showAddTodos(ModelMap model) {
        model.addAttribute("todo", new Todo(0, (String) model.get("name"), "Default Desc",
                new Date(), false));
        return "add-todos";
    }

    //Adding @Valid annotation means that class level validations will be applied to the model attribute as well
    @RequestMapping(value = "/addTodos", method = RequestMethod.POST)
    public String addPostTodo(@Valid Todo todo, ModelMap model, BindingResult result) {

        if (result.hasErrors()) {
            return "add-todos";
        }

        todoService.addTodo((String) model.get("name"), todo.getDesc(), new Date(),
                false);
        return "redirect:/list";
    }

    @RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
    public String deleteTodo(@RequestParam Integer id) {
        todoService.deleteTodo(id);
        return "redirect:/list";
    }
}

