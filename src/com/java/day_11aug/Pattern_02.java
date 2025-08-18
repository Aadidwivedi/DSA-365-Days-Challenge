package com.java.day_11aug;

public class Pattern_02
{
    public static void main(String[] args)
    {
        Derived b = new Derived();
        System.out.println(b.getValue());
    }
}


class Base
{
    int value=0; // 10
    public Base()
    {
        addValue();
    }
    void addValue()
    {
        value += 10; // 20
    }
    int getValue()
    {
        return value;
    }
}
class Derived extends Base
{
    public Derived()
    {
        //
        addValue();
    }
    void addValue()
    {
        super.addValue();//
        value +=  30; // 50
    }
}

