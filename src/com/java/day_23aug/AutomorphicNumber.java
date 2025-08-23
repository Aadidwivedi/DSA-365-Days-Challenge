package com.java.day_23aug;

import java.util.Scanner;

public class AutomorphicNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number  : ");
            int num = sc.nextInt();
            checkAutomorphic(num);
        }
        public static void checkAutomorphic(int num){
            int count = Count(num);
            int num1 = num*num;
            int res = 1;
            for(;count>0;){
               res *= 10;
               count--;
            }
            if(num1%res == num){
                System.out.println(num+ " is an Automorphic Number");
            }else {
                System.out.println(num + " Is Not an Automorphic Number");
            }
        }

    public static int Count(int num){
        int count = 0;
        for(;num>0;num = num/10){
            count++;
        }
        return count;
    }
}
