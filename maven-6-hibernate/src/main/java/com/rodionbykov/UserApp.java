package com.rodionbykov;

import java.util.List;

public class UserApp {

    public static void main(String[] args){
        UserDao service = new UserDao();

        List<User> user = service.getUsers();

        user.forEach(s -> System.out.println(user.toString()));
    }
}
