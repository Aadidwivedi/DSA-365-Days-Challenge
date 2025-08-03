package com.java.day_02_aug;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int firstNumber = Integer.parseInt(sc.next());
        System.out.print("Enter the first number : ");
        int secondNumber = Integer.parseInt(sc.next());

        int lowest = firstNumber>secondNumber?secondNumber:firstNumber;
        int HCFOftwoNumbersIs = 1;

        for(int i = 1 ;i<=lowest;i++){
            if(firstNumber%i==0 &&secondNumber%i==0){

                HCFOftwoNumbersIs = i ;
            }

        }

        System.out.println("LCM OF Two Numbers : " +HCFOftwoNumbersIs);

    }
}
