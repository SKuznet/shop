package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    // http://localhost:8080/
    @RequestMapping("/")
    public String getHelloPage(Model model) {
        model.addAttribute("info", "Hello World!");
        return "hello";
    }

    // http://localhost:8080/name/jack
    @RequestMapping("/name/{name}")
    public String getName(@PathVariable("name") String name, Model model){
        model.addAttribute("name", name);
        return "name";
    }
}
