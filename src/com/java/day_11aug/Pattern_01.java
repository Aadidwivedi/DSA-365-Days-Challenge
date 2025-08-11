package com.java.day_11aug;

public class Pattern_01 {
    public static void main(String[] args) {
        int num = 5;
        for (int j = 1; j <= num; j++) {
int p = num ;
            for (int i = 1; i <= num; i++) {
                if((i+j)==6){
                    System.out.print("*");
                }else{
                    System.out.print(p);
                }
                p--;
            }

            System.out.println();

        }
    }
}
