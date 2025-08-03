package com.java.day_03_aug;

import java.util.Scanner;

public class rotateArrays {
    public static void main(String[] args) {
        int num[] =  new int[] {1,2,3,4,5}; // 1 2 3 4 5 => 2 3 4 5 1 //

        int key = 0 ;
        for(int i = 0 ; i< num.length-1;i++){
            if(key<3) {
                int temp = 0 , j ;
             temp = num[0];
             key++;
             for(j = 0;j< num.length-1; j++){
                 num[j] = num[j+1];
             }
             num[j] = temp;
            }
        }
        for(int i = 0 ; i< num.length;i++){
            System.out.print(num[i] + " ");
        }
    }
}
