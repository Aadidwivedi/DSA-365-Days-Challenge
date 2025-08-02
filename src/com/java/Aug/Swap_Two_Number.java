package com.java.Aug;

import java.util.Scanner;

public class Swap_Two_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int firstNumber = Integer.parseInt(sc.next());

        System.out.print("Enter the first number : ");
        int secondNumber = Integer.parseInt(sc.next());

        firstNumber = secondNumber+firstNumber;
        secondNumber = firstNumber-secondNumber;
        firstNumber = firstNumber-secondNumber;

        System.out.println("Swaping fo Two Number :" + "\nfirstNumber :" +firstNumber +"\nSecondNumber :"+secondNumber);

    }
}
