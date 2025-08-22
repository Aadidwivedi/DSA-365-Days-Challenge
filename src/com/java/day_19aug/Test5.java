package com.java.day_19aug;

public class Test5
{
    public static void main(String[] args)
    {
        new Child1();
    }
}
class Parent1
{
    Parent1(String msg)
    {
        System.out.println("Parent: " + msg); // 1 hello
    }
}

class Child1 extends Parent1
{
    Child1()
    {
        this("Hello");
        System.out.println("Child default"); //3
    }

    Child1(String s)
    {
        super(s);
        System.out.println("Child: " + s); // 2 hello
    }
}


