package com.java.day_23aug;

import java.util.Scanner;

public class SingleDigitSum {

    public static void main(String[] args) {
        System.out.println("Print the single Digit Sum ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  : ");

        int num = sc.nextInt();
      int single =   singleDigit(num);
        System.out.println("Single DigitSum : " +single);
    }
    public static  int singleDigit(int num){

        while(num>9) {
            int sum = 0;
            for (; num > 0; num = num / 10) {
                int rem = num % 10;
                sum += rem;
            }
                num = sum;
        }
        return num;
    }
}
