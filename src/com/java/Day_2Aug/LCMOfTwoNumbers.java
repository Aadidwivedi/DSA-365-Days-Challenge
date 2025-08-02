package com.java.Day_2Aug;

import java.util.Scanner;

public class LCMOfTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int firstNumber = Integer.parseInt(sc.next());
        System.out.print("Enter the first number : ");
        int secondNumber = Integer.parseInt(sc.next());

        int Highest = firstNumber<secondNumber?secondNumber:firstNumber;// uniery op

        int LCMOftwoNumbersIs = 1;

        for(int i = Highest ;i>=0;i++){
            if(i%firstNumber==0 && i%secondNumber==0){

                LCMOftwoNumbersIs = i ;
                break;
            }

        }

        System.out.println("LCM OF Two Numbers : " +LCMOftwoNumbersIs);

    }

    }
