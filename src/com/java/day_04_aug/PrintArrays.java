package com.java.day_04_aug;

import java.util.Scanner;

public class PrintArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of An Arrays : ");
        int num = sc.nextInt();

        int arr[] = new int[num];

        for(int i = 0;i< arr.length;i++){
            System.out.print("Enter the is " + i +" elements : " );
            arr[i] = sc.nextInt();
        }
        System.out.print("Print The Arrays : ");
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
