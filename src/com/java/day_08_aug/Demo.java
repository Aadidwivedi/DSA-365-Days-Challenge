package com.java.day_08_aug;

class Demo
{
    Demo()
    {
        this(10);
        System.out.println("No Argument Constructor");
    }
    Demo(int x)
    {
        System.out.println("Parameterized Constructor: " + x);
    }
    public static void main(String[] args)
    {
        Demo obj = new Demo();
    }
}
