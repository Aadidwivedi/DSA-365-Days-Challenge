package com.java.day_11aug;

public class Pattern_02 {
    public static void main(String[] args) {
        int num = 9 ;
        for(int i= 0;i<(num/2);i++){
            for(int j = 1;j<=num;j++){
                if(j==1-i||j==3-i||j==9-i){
                    System.out.print("*");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
}
