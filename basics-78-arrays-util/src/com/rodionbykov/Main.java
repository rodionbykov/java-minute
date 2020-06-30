package com.rodionbykov;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // source array
        Integer[] myArray = {12, 5, -2, 3, 4, 4, -8, 10, -16, 2};

        // searching for value
        Integer ix = Arrays.binarySearch(myArray, 10);

        System.out.println(ix);

        // sorting
        Arrays.sort(myArray);
        // internally Java uses Insertion Sort, Quick Sort or Merge Sort depending on array values

        // going through array to display all its values
        for(Integer i : myArray) {
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println();

        // copy of array or its part
        Integer[] myArray2 = Arrays.copyOf(myArray, myArray.length);

        // string representation of an array
        String stringFromArray = Arrays.toString(myArray2);

        System.out.println(stringFromArray);

        // compare two arrays
        Integer compareResult = Arrays.compare(myArray, myArray2);

        System.out.println(compareResult);

        // check if arrays are equal
        Boolean isEqual = Arrays.equals(myArray, myArray2);

        System.out.println(isEqual);

    }

}
