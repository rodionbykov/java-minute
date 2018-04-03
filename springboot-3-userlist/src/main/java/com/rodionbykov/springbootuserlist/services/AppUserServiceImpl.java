package com.rodionbykov.springbootuserlist.services;

import com.rodionbykov.springbootuserlist.model.AppUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppUserServiceImpl implements AppUserService {

    private ArrayList<AppUser> appUsers;

    public AppUserServiceImpl(){
        appUsers = new ArrayList<>();
        loadApplicationUsers();
    }

    private void loadApplicationUsers(){
        AppUser appUser = new AppUser();
        appUser.setID(1);
        appUser.setLogin("padawan");
        appUser.setFirstName("Anakin");
        appUser.setLastName("Skywalker");
        appUser.setLevel(0);
        appUsers.add(appUser);

        appUser = new AppUser();
        appUser.setID(2);
        appUser.setLogin("smuggler");
        appUser.setFirstName("Han");
        appUser.setLastName("Solo");
        appUser.setLevel(10);
        appUsers.add(appUser);

        appUser = new AppUser();
        appUser.setID(3);
        appUser.setLogin("jedi");
        appUser.setFirstName("Obiwan");
        appUser.setLastName("Kenobi");
        appUser.setLevel(20);
        appUsers.add(appUser);

        appUser = new AppUser();
        appUser.setID(4);
        appUser.setLogin("master");
        appUser.setFirstName("Yoda");
        appUser.setLastName("");
        appUser.setLevel(30);
        appUsers.add(appUser);
    }

    public List<AppUser> getAllAppUsers() {
        return appUsers;
    }

    public AppUser getAppUserByID(Integer id){
        return appUsers.stream().filter(appUser -> id.equals(appUser.getID())).findFirst().orElse(null);
    }

    public AppUser saveOrUpdateAppUser(AppUser appUser){
        if(appUser != null){
            if(appUser.getID() == null){
                appUser.setID(getNextKey());
                appUsers.add(appUser);

                return appUser;
            }else{
                AppUser au = getAppUserByID(appUser.getID());
                au.setLogin(appUser.getLogin());
                au.setFirstName(appUser.getFirstName());
                au.setLastName(appUser.getLastName());
                au.setLevel(appUser.getLevel());

                return au;
            }

        }else{
            throw new RuntimeException("Application User cannot be null");
        }
    }

    private Integer getNextKey(){
        Integer maxID = 0;
        for (AppUser au: appUsers) {
            if(au.getID() > maxID){
                maxID = au.getID();
            }
        }
        return maxID + 1;
    }

}
