package com.rodionbykov;

public class Main {

    public static void main(String[] args) {

        // create new string in string pool using string literal
        String poolString1 = "Hello";
        String poolString2 = "Hello";

        // string pool strings are actually the same object
        System.out.println(poolString1 == poolString2);

        // obviously, comparing two strings will return 0 meaning they are equal
        System.out.println(poolString1.compareTo(poolString2));

        // create new String objects in heap
        String heapString1 = new String("World!");
        String heapString2 = new String("World!");

        // every new heap String is a new object, so comparing them will give false
        System.out.println(heapString1 == heapString2);

        // however comparing strings will also give 0
        System.out.println(heapString1.compareTo(heapString2));

        String poolString3 = "Hello World!";
        String heapString3 = new String("Hello World!");

        // comparing pool ("interned" strings) to string objects stored in heap memory will always be false
        System.out.println(poolString3 == heapString3);

        System.out.println(poolString3.compareTo(heapString3));

    }
}
