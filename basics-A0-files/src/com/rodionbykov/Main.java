package com.rodionbykov;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        File file = new File("out/production/basics-A0-files/resources/test.txt");

        try {
            FileReader fr = new FileReader(file);

            try {
                BufferedReader br = new BufferedReader(fr);
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
            }catch(Exception e){
                e.printStackTrace();
            }

            fr.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        // try with resources
        // if class is @AutoClosable then resource will be closed (freed) automatically
        try(FileReader fr2 = new FileReader(file)) {
            try(BufferedReader br2 = new BufferedReader(fr2)){
                String line;
                while ((line = br2.readLine()) != null) {
                    System.out.println(line);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
