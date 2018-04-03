package com.rodionbykov.springbootuserlist.controllers;

import com.rodionbykov.springbootuserlist.model.AppUser;
import com.rodionbykov.springbootuserlist.services.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppUsersController {

    private AppUserService appUserService;

    @Autowired
    public void setAppUserService(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @RequestMapping("/users")
    public String listAppUsers(Model model){

        model.addAttribute("appUsers", appUserService.getAllAppUsers());

        return "appusers";
    }

    @RequestMapping("/users/{id}")
    public String showAppUser(@PathVariable Integer id, Model model){
        model.addAttribute("appUser", appUserService.getAppUserByID(id));

        return "appuser";
    }

    @RequestMapping("/users/edit/{id}")
    public String editAppUser(@PathVariable Integer id, Model model){
        model.addAttribute("appUser", appUserService.getAppUserByID(id));

        return "appuserform";
    }

    @RequestMapping("/users/new")
    public String createAppUser(Model model){
        model.addAttribute("appUser", new AppUser());

        return "appuserform";
    }

    @RequestMapping(value="/user", method=RequestMethod.POST)
    public String saveAppUser(AppUser appUser){
        AppUser newUser = this.appUserService.saveOrUpdateAppUser(appUser);

        return "redirect:/users/" + newUser.getID().toString();
    }
}
