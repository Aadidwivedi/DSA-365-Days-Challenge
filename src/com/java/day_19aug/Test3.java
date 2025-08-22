package com.java.day_19aug;

public class Test3
{
    public static void main(String[] args)
    {
        new Child().print();
    }
}
class Parent
{
    int x = 10;
}

class Child extends Parent
{
    int x = 20;
    void print()
    {
        System.out.println(x);
    }
}


