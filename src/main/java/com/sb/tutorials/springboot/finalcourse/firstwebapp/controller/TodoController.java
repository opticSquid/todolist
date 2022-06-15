package com.sb.tutorials.springboot.finalcourse.firstwebapp.controller;

import com.sb.tutorials.springboot.finalcourse.firstwebapp.model.Todo;
import com.sb.tutorials.springboot.finalcourse.firstwebapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@SessionAttributes("name")
public class TodoController {
    @Autowired
    TodoService todoService;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                dateFormat, false));
    }

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
    public String postAddTodo(@Valid Todo todo, ModelMap model, BindingResult result) {

        if (result.hasErrors()) {
            return "add-todos";
        }

        todoService.addTodo((String) model.get("name"), todo.getDesc(), todo.getTargetDate(),
                false);
        return "redirect:/list";
    }

    @RequestMapping(value = "/update-todo", method = RequestMethod.GET)
    public String showUpdateTodo(@RequestParam Integer id, ModelMap model) {
        Todo todo = todoService.retrieveTodo(id);
        model.put("todo", todo);
        return "add-todos";
    }

    @RequestMapping(value = "/update-todo", method = RequestMethod.POST)
    public String postUpdateTodo(@Valid Todo todo, BindingResult result, ModelMap model) {
        todo.setUser((String) model.get("name"));
        if (result.hasErrors()) {
            return "add-todos";
        }
        todoService.updateTodo(todo);
        return "redirect:/list";
    }

    @RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
    public String deleteTodo(@RequestParam Integer id) {
        todoService.deleteTodo(id);
        return "redirect:/list";
    }
}

