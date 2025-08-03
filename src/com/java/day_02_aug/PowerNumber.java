package com.java.day_02_aug;

import java.util.Scanner;

public class PowerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = Integer.parseInt(sc.next());

        System.out.print("Enter the Power number : ");
        int pow = Integer.parseInt(sc.next());
        int res = 1 ;
        for(int i = 1 ; i<=pow; i++){
           res *=num ;
        }
        System.out.println("Power Of Number : " + res);

    }
}
