package com.wad.firstmvc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home(){
        return "index";

    }
    @GetMapping("/learn_more")
    public String learnMore() {
        return "learn_more";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/zodiac_form")
    public String zodiac_form() {
        return "zodiac_form";
    }
}
