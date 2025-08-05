package com.java.day_05_aug;

import java.util.Scanner;

public class RightRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Arrays : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        int c= 3;

        for(int i = 0; i< arr.length;i++){
            System.out.print("please enter the " + i + " : ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("left Rotate Arrays : ");

        for (int i = 0; i < c; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }



        for(int j = 0 ;j< arr.length;j++){
            System.out.print(arr[j] + " ");
        }
    }


}

