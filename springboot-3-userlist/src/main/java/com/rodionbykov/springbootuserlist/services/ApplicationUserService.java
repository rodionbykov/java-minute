package com.rodionbykov.springbootuserlist.services;

import com.rodionbykov.springbootuserlist.model.ApplicationUser;

import java.util.List;

public interface ApplicationUserService {

    List<ApplicationUser> getAllApplicationUsers();

}