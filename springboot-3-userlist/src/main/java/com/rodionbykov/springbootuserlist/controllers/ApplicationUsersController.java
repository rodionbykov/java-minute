package com.rodionbykov.springbootuserlist.controllers;

import com.rodionbykov.springbootuserlist.model.ApplicationUser;
import com.rodionbykov.springbootuserlist.services.ApplicationUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationUsersController {

    private ApplicationUserService applicationUserService;

    @Autowired
    public void setApplicationUserService(ApplicationUserService applicationUserService) {
        this.applicationUserService = applicationUserService;
    }

    @RequestMapping("/users")
    public String listApplicationUsers(Model model){

        model.addAttribute("applicationUsers", applicationUserService.getAllApplicationUsers());

        return "users";
    }

}
