package com.java.Aug;

import java.util.Scanner;

public class Add_Number_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int firstNumber = Integer.parseInt(sc.next());

        System.out.print("Enter the first number : ");
        int secondNumber = Integer.parseInt(sc.next());

        System.out.println("Sum of Two Numbers :" +(firstNumber+secondNumber));
    }
}
