package com.java.day_19aug;


public class Test6
{
    public static void main(String[] args)
    {
        new A2();
    }
}
class A2
{
    A2()
    {
        this(10);
        System.out.println("A no-arg");
    }

    A2(int x)
    {
        System.out.println("A int: " + x);
    }
}


