package com.java.day_23aug;

import java.util.Scanner;

public class DisariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  : ");
        int num = sc.nextInt();
        int count = Count(num);
        int Disarim = DisariumNumber(num,count);
       // System.out.println("Digstram Number : " + Disarim);
        if(Disarim==num){
            System.out.println("Digstram Number : " + Disarim);
        }else{
            System.out.println("Is Not Digstram Number : " + Disarim);
        }
    }
    public static int DisariumNumber(int num , int count){
        int res = 0;
        for (;num>0;num = num/10){
            int rem = num%10;
            int c = count;
            int prod = 1;
            while(c>0){
               prod *= rem;
               c--;
            }
            res += prod;
            count--;
        }
      return res ;
    }
    public static int Count(int num){
        int count = 0;
        for(;num>0;num = num/10){
            count++;
        }
        return count;
    }
}
