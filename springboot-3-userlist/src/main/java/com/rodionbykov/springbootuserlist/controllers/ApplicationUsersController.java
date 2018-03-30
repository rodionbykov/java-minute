package com.rodionbykov.springbootuserlist.controllers;

import com.rodionbykov.springbootuserlist.model.ApplicationUser;
import com.rodionbykov.springbootuserlist.services.ApplicationUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping("/user/{id}")
    public String showApplicationUser(@PathVariable Integer id, Model model){
        model.addAttribute("applicationUser", applicationUserService.getApplicationUserByID(id));

        return "user";
    }

    @RequestMapping("/user/new")
    public String createApplicationUser(Model model){
        model.addAttribute("applicationUser", new ApplicationUser());

        return "new";
    }

    @RequestMapping(value="/user", method=RequestMethod.POST)
    public String saveApplicationUser(ApplicationUser applicationUser){
        ApplicationUser newUser = this.applicationUserService.saveOrUpdateApplicationUser(applicationUser);

        return "redirect:/user/" + newUser.getID().toString();
    }
}
