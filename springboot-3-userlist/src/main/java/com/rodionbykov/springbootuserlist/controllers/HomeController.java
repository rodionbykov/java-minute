package com.rodionbykov.springbootuserlist.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// Controller to handle incoming request

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
        // by convention, method returns String index and Spring will search for /templates/index.html
    }

}
