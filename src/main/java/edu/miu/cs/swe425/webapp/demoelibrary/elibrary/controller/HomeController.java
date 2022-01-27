package edu.miu.cs.swe425.webapp.demoelibrary.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/")
public class HomeController {

    @GetMapping(value = {"/", "/elibrary", "/home", "/elibrary/home"})
    public String home() {
        return "home/index";
    }

}
