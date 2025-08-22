package com.java.day_19aug;

public class Test
{
    public static void main(String[] args)
    {
        new B();
    }
}
class A
{
    A()
    {
        System.out.println("A Constructor");
    }
}

class B extends A
{
    B()
    {
        System.out.println("B Constructor");
    }
}

