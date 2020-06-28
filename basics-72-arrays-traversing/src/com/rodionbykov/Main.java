package com.rodionbykov;

public class Main {

    public static void main(String[] args) {

        Integer[] array1 = {-12, -2, 3, 4, 4, 5, 8, 10, 16, 20};

        // let's find a pairs which add up to 8
        Integer target = 8;

        // traversing array to match elements with each other
        for(Integer i=0; i < array1.length-1; i++){
            for(Integer j=i+1; j < array1.length; j++){
                if(array1[i]+array1[j] == target){
                    System.out.print(i);
                    System.out.print(",");
                    System.out.println(j);
                }
            }
        }

    }
}
