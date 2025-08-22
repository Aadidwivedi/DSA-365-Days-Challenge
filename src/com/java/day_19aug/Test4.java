package com.java.day_19aug;

public class Test4
{
    public static void main(String[] args)
    {
        new B1();
    }
}
class A1
{
    A1()
    {
        System.out.println("A constructor"); // 1
    }
}

class B1 extends A1
{
    B1()
    {
        this(5);
        System.out.println("B no-arg constructor"); /// 3
    }

    B1(int x)
    {
        super();
        System.out.println("B int constructor: " + x); //2 5
    }
}


