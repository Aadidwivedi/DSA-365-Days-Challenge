package com.java.day_08_aug;

class Test10
{
    private int x = 99 ;

    {
        x = 15;
    }

    public Test10()
    {
        super();
        x = 56;
    }

    public int getX()
    {
        return this.x;
    }
}

 class Order
{
    public static void main(String[] args)
    {
        Test10 t1 = new Test10();

        System.out.println(t1.getX()); // 56
    }

}

