package org.example.goldmansachs;

public class MedianOfSortedArrays {


    // with new array creation - - space complexity of O(n) + timecomplexity O(m+n)
    static double findMedianOfTwoSortedArrays(int[] arr1, int[] arr2){

        int len1 = arr1.length;
        int len2 = arr2.length;
        int total = len1+len2;

        int mid1 = total%2 == 0 ? (total/2 - 1) : total/2;
        int mid2 = total/2;

        int i=0;
        int j=0;
        int k=0;
        int[] arr3 = new int[total];
        while(i<len1 && j< len2){
            if(arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i++;
            }else{
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<len1){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while(j<len2){
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        return (double) (arr3[mid1] + arr3[mid2]) / 2;
    }

    // without new array creation - space complexity -- O(1), time complexity O(m+n)
    static double findMedianOfTwoSortedArrays1(int[] arr1, int[] arr2){

        int len1 = arr1.length;
        int len2 = arr2.length;
        int total = len1+len2;

        int mid1 = total%2 == 0 ? (total/2 - 1) : total/2;
        int mid2 = total/2;

        int i=0;
        int j=0;
        int k=0;
        int a =0; int b =0;
        while(i<len1 && j< len2){
            if(arr1[i] < arr2[j]){

                if(k==mid1){
                    a = arr1[i];
                }
                if(k == mid2){
                    b = arr1[i];
                }

                i++;
            }else{

                if(k==mid1){
                    a = arr2[j];
                }
                if(k == mid2){
                    b = arr2[j];
                }

                j++;
            }
            k++;
        }
        while(i<len1){
            if(k==mid1){
                a = arr1[i];
            }
            if(k == mid2){
                b = arr1[i];
            }
            k++;
            i++;
        }
        while(j<len2){
            if(k==mid1){
                a = arr2[j];
            }
            if(k == mid2){
                b = arr2[j];
            }
            j++;
            k++;
        }

        return (double) (a+b) / 2;
    }

    public static void main(String[] args) {
        System.out.println(findMedianOfTwoSortedArrays(new int[]{1,2,3}, new int[]{4,5,6}));
        System.out.println(findMedianOfTwoSortedArrays1(new int[]{1,2,3}, new int[]{4,5,6,7}));

    }
}
