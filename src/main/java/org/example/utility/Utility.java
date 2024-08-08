package org.example.utility;

public interface Utility {

     static void printArray(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
         System.out.println();
    }
    static String reverseString(String str){
         String s = "";
         for(char c : str.toCharArray()){
             s = c+s;
         }
         return s;
    }
}
