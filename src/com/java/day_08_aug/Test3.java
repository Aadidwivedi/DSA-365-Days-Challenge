package com.java.day_08_aug;

public class Test3 {
    int x = 10;

    {
        x += 5; // x = x+5 => 10+5 => 15 ;
    }

    {
        x += 10;  // x = x+10 = > 15+10 => 25
    }

    public static void main(String[] args)
    {
        Test3 obj1 = new Test3();
        System.out.println(obj1.x); // 25
    }
}
