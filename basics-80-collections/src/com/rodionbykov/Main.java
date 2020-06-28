package com.rodionbykov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "blah");
        System.out.println(hashMap.put(1, "foo"));
        ArrayList<String> addresses = new ArrayList<>();

        String bar = hashMap.get(1);
        System.out.println(bar);

        String[] names = new String[]{"John", "James", "Jonah"};
        List<String> strings = Arrays.asList(names);

        for(String i : strings){
            System.out.println(i);
        }

        for(int j = 0; j < strings.size(); j++){
            System.out.println(strings.get(j));
        }


    }
}
