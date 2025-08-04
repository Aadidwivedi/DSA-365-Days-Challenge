package com.java.day_04_aug;

import java.util.Scanner;

public class LargestElementArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter The Arrays Size : ");
        int num = sc.nextInt();

        int arr[] = new int[num];

        for(int i = 0;i< arr.length;i++){
            System.out.print("Enter the is " + i +" elements : " );
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 1 ;i< arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Max Element : " + max);
    }
}
