package com.java.day_19aug;

public class ChildClass extends BaseClass
{
    ChildClass()
    {
        System.out.print("#"); // 2
    }
    ChildClass(String name)
    {
        this();
        System.out.print("$" + name); // 3
    }
    public static void main(String args[])
    {
        new ChildClass("hello");
    }
}

class BaseClass
{
    BaseClass()
    {
        System.out.print("*"); // *
    }
    BaseClass(String str)
    {
        this();
        System.out.print("@" + str);
    }
}

