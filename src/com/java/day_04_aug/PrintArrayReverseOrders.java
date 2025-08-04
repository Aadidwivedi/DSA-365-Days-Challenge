package com.java.day_04_aug;

import java.util.Scanner;

public class PrintArrayReverseOrders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter The Arrays Size : ");
        int num = sc.nextInt();

        int arr[] = new int[num];

        for(int i = 0;i< arr.length;i++){
            System.out.print("Enter the is " + i +" elements : " );
            arr[i] = sc.nextInt();
        }
        System.out.print("Print The Reverse Arrays : ");
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}
