package com.java.day_05_aug;

import java.util.Scanner;

public class ShortingAssendingOrder {
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
        }
        for(int j = 0;j< arr.length;j++){
        for(int i = 0;i< arr.length-1;i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = 0;
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
          }

        }
        System.out.print("Shorted Arrays:");
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
