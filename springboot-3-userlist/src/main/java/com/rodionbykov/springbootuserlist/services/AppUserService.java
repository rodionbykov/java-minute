package com.rodionbykov.springbootuserlist.services;

import com.rodionbykov.springbootuserlist.model.AppUser;

import java.util.List;

public interface AppUserService {

    List<AppUser> getAllAppUsers();

    AppUser getAppUserByID(Integer id);

    AppUser saveOrUpdateAppUser(AppUser applicationUser);

}
