package com.rodionbykov;

class Main {

    public static void main(String[] args) {

        Integer[] myArray = {12, 5, -2, 3, 4, 4, -8, 10, -16, 2};
        Integer tmp;

        System.out.println("Sorting with bubble sort");

        // sorting with bubble sort
        for(Integer i = 1; i < myArray.length; i++) {
            for(Integer j = myArray.length - 1; j >= i; j--) {
                if(myArray[j-1] > myArray[j]){
                    tmp = myArray[j];
                    myArray[j] = myArray[j-1];
                    myArray[j-1] = tmp;
                }
            }
        }

        System.out.print(myArray[0]);
        for(Integer i = 1; i < myArray.length; i++) {
            System.out.print(",");
            System.out.print(myArray[i]);
        }

        System.out.println();
        System.out.println("Sorting with quick sort");

        Integer[] myArray2 = {12, 5, -2, 3, 4, 4, -8, 10, -16, 2};

        // sorting with quicksort
        quickSort(myArray2, 0, myArray2.length-1);

        System.out.print(myArray2[0]);
        for(Integer i = 1; i < myArray2.length; i++) {
            System.out.print(",");
            System.out.print(myArray2[i]);
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
