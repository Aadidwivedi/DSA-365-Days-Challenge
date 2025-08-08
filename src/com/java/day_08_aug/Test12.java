package com.java.day_08_aug;

public class Test12
{
    public static void main(String[] args)
    {
        Dem d1 = new Dem();
        System.out.println("User value :"+d1.x); // 222
    }
}

 class Dem
{
    final int x;

    {
        print();
        x = 222;
    }
    public void print()
    {
        System.out.println("Default Value :"+x); // 0
    }


}

