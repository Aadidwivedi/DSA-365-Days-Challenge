package com.java.day_02_aug;

public class FirstAndLastSumArr {
    public static void main(String[] args) {


        int arr1[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        int arr2[] = new int[]{2, 4, 1, 6, 7, 3, 9};
        int arr[] = new int[arr1.length];

        System.out.print("arr[i] : ");

        for (int i = 0; i < arr1.length; i++) {

            arr[i] = arr1[i]+arr2[arr.length-i-1];

            System.out.print (arr[i] + " ");

        }
    }
}
