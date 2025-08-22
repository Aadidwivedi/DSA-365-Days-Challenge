package com.java.day_19aug;

public class Test1
{
    public static void main(String[] args)
    {
        new Alpha();

    }
}
class Alpha
{
    Beta b = new Beta();

    public Alpha()
    {
        System.out.println("Alpha class constructor");
    }


    {
        System.out.println("Non static block of Alpha class");
    }
}
class Beta
{
    public Beta()
    {
        System.out.println("Beta class constructor");
    }
}


