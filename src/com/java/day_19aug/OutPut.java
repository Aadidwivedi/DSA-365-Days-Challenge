package com.java.day_19aug;

class OutPut
{
    public static void main(String[] args)
    {
        new Alph();
        new Base();
    }
}
class Alph extends Base
{
    Alph()
    {
        super();
        System.out.println("Base2"); //2
    }
}
class Base
{
    Base()
    {
        super();
        System.out.println("Base1"); //1
    }
}
