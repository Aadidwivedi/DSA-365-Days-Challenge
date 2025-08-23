package com.java.day_23aug;

import java.util.Scanner;

public class AddAlternateDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  : ");
        int num = sc.nextInt();
        addAlternate(num);
    }
    public static void addAlternate(int num){
        int count = 0;
        int sum = 0;
        for(;num>0;num = num/10){
            count++;
            int rem = num%10;
            if(count%2==1){
                sum += rem;
            }
        }
        System.out.println("Alternate digits sum : " + sum);
    }
}
