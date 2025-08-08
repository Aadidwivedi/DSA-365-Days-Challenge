package com.java.day_08_aug;

class Foo1
{
    final int x;

    {
        x = 123;
    }


    public Foo1()
    {
       // x = 300; // error
    }
}
public class Test13
{
    public static void main(String[] args)
    {
        Foo1 f1 = new Foo1();
        System.out.println(f1.x);
    }
}

