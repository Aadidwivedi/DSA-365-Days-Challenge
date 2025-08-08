package com.java.day_08_aug;

class Foo
{
    public Foo(int x, int y)
    {
        this(2.4, 5.7);
        System.out.println("Integer parameter constructor"); //3
    }
    public Foo(double x, double y)
    {
        System.out.println("Double parameter constructor"); // 2
    }

    {
        System.out.println("Non static block"); // 1
    }

}
   class InstanceBlockDemo4 {

    public static void main(String[] args)
    {
        Foo f1 = new Foo(100,200);

    }

}



