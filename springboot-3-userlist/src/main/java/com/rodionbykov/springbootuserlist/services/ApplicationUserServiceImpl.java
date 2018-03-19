package com.rodionbykov.springbootuserlist.services;

import com.rodionbykov.springbootuserlist.model.ApplicationUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicationUserServiceImpl implements ApplicationUserService{

    private ArrayList<ApplicationUser> applicationUsers;

    public ApplicationUserServiceImpl(){
        applicationUsers = new ArrayList<>();
        loadApplicationUsers();
    }

    private void loadApplicationUsers(){
        ApplicationUser applicationUser = new ApplicationUser();

        applicationUser.setID(1);
        applicationUser.setLogin("padawan");
        applicationUser.setFirstName("Anakin");
        applicationUser.setLastName("Skywalker");
        applicationUser.setLevel(0);
        applicationUsers.add(applicationUser);

        applicationUser = new ApplicationUser();
        applicationUser.setID(2);
        applicationUser.setLogin("smuggler");
        applicationUser.setFirstName("Han");
        applicationUser.setLastName("Solo");
        applicationUser.setLevel(10);
        applicationUsers.add(applicationUser);

        applicationUser = new ApplicationUser();
        applicationUser.setID(3);
        applicationUser.setLogin("jedi");
        applicationUser.setFirstName("Obiwan");
        applicationUser.setLastName("Kenobi");
        applicationUser.setLevel(20);
        applicationUsers.add(applicationUser);

        applicationUser = new ApplicationUser();
        applicationUser.setID(4);
        applicationUser.setLogin("master");
        applicationUser.setFirstName("Yoda");
        applicationUser.setLastName("");
        applicationUser.setLevel(30);
        applicationUsers.add(applicationUser);
    }

    public List<ApplicationUser> getAllApplicationUsers() {
        return applicationUsers;
    }
}
