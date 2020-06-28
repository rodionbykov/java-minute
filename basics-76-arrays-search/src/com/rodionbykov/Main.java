package com.rodionbykov;

class Main {

    public static void main(String[] args) {

        // source array
        Integer[] myArray = {12, 5, -2, 3, 4, 4, -8, 10, -16, 2};

        // value to be searched
        Integer target = 10;

        // index of element in array
        Integer ix = -1;

        // linear search - going through all values until finding target value
        for(Integer i = 0; i < myArray.length; i++) {
            if(myArray[i] == target){
                ix = i;
            }
        }

        System.out.print(myArray[0]);
        for(Integer i = 1; i < myArray.length; i++) {
            System.out.print(",");
            System.out.print(myArray[i]);
        }

        System.out.println();

        System.out.println(ix);

        // searching by ordered array
        quickSort(myArray, 0, myArray.length-1);

        // binary search
        Integer l = 0;
        Integer r = myArray.length - 1;
        Boolean found = false;

        while (l <= r && !found) {
            ix = (l + r) / 2;

            if(myArray[ix] == target) {
                found = true;
            } else if(myArray[ix] < target){
                l = ix + 1;
            } else {
                r = ix - 1;
            }

        }

        System.out.print(myArray[0]);
        for(Integer i = 1; i < myArray.length; i++) {
            System.out.print(",");
            System.out.print(myArray[i]);
        }

        System.out.println();

        if(found) {
            System.out.println(ix);
        } else {
            System.out.println("Not found");
        }

    }

    private static void quickSort(Integer[] arr, Integer l, Integer r) {
        Integer i = l;
        Integer j = r;
        Integer ix = (l + r) / 2;
        Integer pivot = arr[ix];
        Integer tmp;

        do {
            while(arr[i] < pivot) i++;
            while(pivot < arr[j]) j--;
            if(i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }while(i < j);

        if(l < j)
            quickSort(arr, l, j);
        if(i < r)
            quickSort(arr, i, r);

    }

}
