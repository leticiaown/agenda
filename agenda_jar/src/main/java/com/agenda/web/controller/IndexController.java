package com.agenda.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller 
public class IndexController {
      
    @GetMapping("/")
    public ModelAndView findAll() {

        ModelAndView mv = new ModelAndView("/index");

        return mv;
    }
    
}
