package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public ModelAndView helloWorld() {
        // hello.jsp에 "Hello, World!"를 전달
        ModelAndView model = new ModelAndView("hello");
        model.addObject("message", "Hello, World!");

        return model;
    }
}