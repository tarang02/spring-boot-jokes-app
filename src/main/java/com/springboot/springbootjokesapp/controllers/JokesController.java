package com.springboot.springbootjokesapp.controllers;

import com.springboot.springbootjokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/jokes")
    public String showJoke(Model model){
        model.addAttribute("joke", jokesService.getJokes());
        return "index";
    }
}
