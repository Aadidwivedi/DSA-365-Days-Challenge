package com.java.day_08_aug;

public class Test2 {
    {
        System.out.println("Non-static Block");
    }
    Test2()
    {
        System.out.println("Constructor");
    }

    public static void main(String[] args)
    {
        Test2 obj1 = new Test2();
        Test2 obj2 = new Test2();
    }
}
