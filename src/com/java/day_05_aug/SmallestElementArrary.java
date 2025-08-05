package com.java.day_05_aug;

import java.util.Scanner;

public class SmallestElementArrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Arrays : ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        for(int i = 0; i< arr.length;i++){
            System.out.print("please enter the " + i + " : ");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i = 1; i< arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Minimum Elements : " + min);
    }
}
