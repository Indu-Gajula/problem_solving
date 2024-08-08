package org.example.goldmansachs;

import java.util.stream.Stream;

public class GenerateBinaryStrings {

    // GenerateBinaryStrings.generateBinaryStringsInOrder(0,4, new int[4]);
    public static void generateBinaryStringsInOrder(int i, int n,int []arr){
        if(i==n){
            printArr(arr);
            return;
        }

        arr[i] = 0;
        generateBinaryStringsInOrder(i+1,n,arr);

        arr[i] = 1;
        generateBinaryStringsInOrder(i+1,n,arr);


    }
    public static void printArr(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
