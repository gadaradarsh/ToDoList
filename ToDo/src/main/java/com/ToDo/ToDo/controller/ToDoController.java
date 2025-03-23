package com.ToDo.ToDo.controller;

import com.ToDo.ToDo.model.ToDomodel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ToDoController {
    List<ToDomodel> toDos = new ArrayList<>();

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("todos", toDos);
        return "home";
    }

    @RequestMapping("/addtodoform") // Show form
    public String addtodo(Model model) {

        return "addtodo";
    }

    @PostMapping("/addtodo")
    public String addTodo(@ModelAttribute ToDomodel todoref) {
        System.out.println("Received Task: " + todoref.getTask());
        toDos.add(todoref);
        return "redirect:/home";
    }
    @PostMapping("/delete/{number}")
    public String deleteTodo(@PathVariable int number) {
        toDos.removeIf(todo -> todo.getNumber() == number);
        return "redirect:/home";
    }

}
