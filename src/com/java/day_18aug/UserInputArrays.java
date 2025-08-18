package com.java.day_18aug;

import java.util.Scanner;

public class UserInputArrays {
    public static void main(String[] args) {
        System.out.print("Enter The number of size of an Arrays: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int arr[] = new int[num];

        for(int i = 0;i< arr.length;i++){
            System.out.print("Enter the " + i + " elements: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Arrays: ");
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
