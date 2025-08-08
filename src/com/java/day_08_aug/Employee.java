package com.java.day_08_aug;

class Employee
{
    int eno ;
    String ename ;
    float esal ;
    public static void main(String[] args)
    {
        Employee e = new Employee();
        System.out.println("Eno : "+e.eno); // 0
        System.out.println("Ename : "+e.ename);// null
        System.out.println("Esal : "+e.esal);//0.0
    }
}
