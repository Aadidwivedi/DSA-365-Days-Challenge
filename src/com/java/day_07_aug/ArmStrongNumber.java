package com.java.day_07_aug;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please calculate the ArmStrong Number : ");
        System.out.print("Please Enter the number : ");
        int num = sc.nextInt();

        int c = count(num);
        System.out.println(c);

       int  arm = armStrongNumber(num,c);
        System.out.println(arm);
        if(arm==num){
            System.out.println(num + " : is a ArmStrong Number");
        }else{
            System.out.println(num + " : is Not a ArmStrong Number");
        }
    }
    public static int armStrongNumber(int num , int c){
        int res = 0;
        for(;num>0;num = num/10){
            int rem = num%10;
            int prod = 1;
            int count = 0 ;
            count = c;
            while(count>0){
               prod *= rem;
               count--;
            }

            res += prod;
        }

        return  res ;
    }
    public static  int count(int num){
        int c = 0;
        for(;num>0;num=num/10){
            c++;
        }
        return  c;
    }
}
