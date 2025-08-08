package com.java.day_08_aug;

class Example
{
    int eid;
    String ename;
    String company;
    public String toString(){
        return "eid:"+eid+"\n"+"ename:"+ename+"\n"+"company:"+company+"\n";
    }
    public static void main(String[] args)
    {
        Example e1=new Example();
        e1.eid=7279;
        e1.ename="Ganesh";
        e1.company="Naresh IT";
        System.out.println(e1);
    }
}
