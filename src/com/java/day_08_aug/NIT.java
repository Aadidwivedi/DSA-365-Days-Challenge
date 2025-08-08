package com.java.day_08_aug;

class NIT
{
    public NIT()
    {
        System.out.println("Constructor");//1

        {
            System.out.println("Non static block");//2
        }
    }
}

 class InstanceBlockDemo6
{

    public static void main(String[] args)
    {
        new NIT();

    }

}
