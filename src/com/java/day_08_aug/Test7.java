package com.java.day_08_aug;

public class Test7
{
    int a;
    {
        Test7 obj = new Test7(); // Stack overflow error
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        Test7 obj=new Test7();
        System.out.println(obj.a);
    }
}
