package com.java.day_19aug;

public class Test7
{
    public static void main(String[] args)
    {
        new Derived();
    }
}

class Base3
{
    Base3()
    {
        System.out.println("Base()");
    }
    Base3(int x)
    {
        System.out.println("Base(int): " + x); // 1 20
    }
}

class Derived extends Base3
{
    Derived()
    {
        this(20);
        System.out.println("Derived()"); // 3
    }
    Derived(int y)
    {
        super(y);
        System.out.println("Derived(int): " + y); // 2
    }
}


