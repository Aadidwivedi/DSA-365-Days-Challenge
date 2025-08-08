package com.java.day_08_aug;

public class Test
{
    public static void main(String[] args)
    {
        System.out.println("main method");
        new Test1();
    }
}

class Test1 {
        Test1()
        {
            System.out.println("Constructor");
        }

        {
            System.out.println("Non-static block");
        }
    }



