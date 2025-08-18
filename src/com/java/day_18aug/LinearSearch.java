package com.java.day_18aug;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {2 , 13 , 4 , 1 , 3 , 6 , 28};
        int key = 3 ;

        for(int i =0;i<arr.length; i++){
           if(arr[i]==key){
               System.out.println(i);
             return;
           }
        }
        System.out.println(-1);
    }
}
