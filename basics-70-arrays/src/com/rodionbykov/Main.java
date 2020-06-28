package com.rodionbykov;

public class Main {

    public static void main(String[] args) {

        // declaring an array and specifying its size
        Integer[] myArray1 = new Integer[10];

        // declaring and initializing with an array literal
        Integer[] myArray2 = {-12, -2, 3, 4, 4, 5, 8, 10, 16, 20};

        // accessing element
        Integer a = myArray1[1];
        // empty element is 'null'
        System.out.println(a);

        Integer b = myArray2[1];
        // output -2
        System.out.println(b);

        // two-dimensional array, a matrix
        Integer[][] myMatrix = new Integer[10][10];
        // accessing matrix element
        myMatrix[2][5] = 42;

        // number of elements of the array
        System.out.println(myArray1.length);
        System.out.println(myArray2.length);
    }
}
