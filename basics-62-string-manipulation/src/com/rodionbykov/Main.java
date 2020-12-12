package com.rodionbykov;

public class Main {

    public static void main(String[] args) {

        String sourceString1 = "Hello";
        String sourceString2 = " ";
        String sourceString3 = "World!";

        // concatenating strings
        String resultString1 = sourceString1 + sourceString2 + sourceString3;

        System.out.println(resultString1);

        // or

        String resultString2 = sourceString1.concat(sourceString2).concat(sourceString3);

        System.out.println(resultString2);

        // new strings are new heap objects
        System.out.println(resultString1 == resultString2);

        // comparing strings 
        System.out.println(resultString1.compareTo(resultString2));

        // searching
    }
}
