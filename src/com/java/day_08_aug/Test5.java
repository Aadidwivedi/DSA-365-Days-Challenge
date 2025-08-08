package com.java.day_08_aug;

public class Test5 {

    int a ;
    public static void main(String args[])
    {
        new Test5();
    }
    {
        System.out.println(this.a); // 0
        this.a = 100 ;
    }
    Test5()
    {
        System.out.println(this.a); // 100
    }
}
