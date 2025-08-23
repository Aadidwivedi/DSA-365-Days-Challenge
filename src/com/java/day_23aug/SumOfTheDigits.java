package com.java.day_23aug;

import java.util.Scanner;

public class SumOfTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  : ");
        int num = sc.nextInt();
        sumDigits(num);
    }
    public static void sumDigits(int num){
        int sum = 0;
        for(;num>0;num=num/10){
            sum+=num%10;
        }
        System.out.println("Sum of digits = "+sum);
    }
}
