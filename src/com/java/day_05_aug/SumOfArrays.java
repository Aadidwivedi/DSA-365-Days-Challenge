package com.java.day_05_aug;

import java.util.Scanner;

public class SumOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Arrays : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        int sum = 0 ;
        for(int i = 0; i< arr.length;i++){
            System.out.print("please enter the " + i + " : ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
            sum+=arr[i];
        }
        System.out.println("\nSum of Array is : " + sum);
    }
}
