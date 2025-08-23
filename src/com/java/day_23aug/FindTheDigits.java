package com.java.day_23aug;

import java.util.Scanner;

public class FindTheDigits {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number  : ");
            int num = sc.nextInt();
            findDigits(num);
        }
        public static void findDigits(int num){
            int count = countDigit(num);
            System.out.print("Digits are: ");
            for(;num>0;num=num%count,count = count/10){//123%100 = 23

                System.out.print(num/count + " ");// 123/100 = 1
            }
        }
    public static int countDigit(int num){
        int count = 1;
        for(;num>9;num=num/10){
            count *= 10 ;
            }
        return count;
        }
}