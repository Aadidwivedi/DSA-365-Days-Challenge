package com.java.day_05_aug;

import java.util.Scanner;

public class SizeOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Arrays : ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        for(int i = 0; i< arr.length;i++){
            System.out.print("please enter the " + i + " : ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i] +",");
        }
        System.out.println("Size of Arrays is : " + arr.length);
    }
}
