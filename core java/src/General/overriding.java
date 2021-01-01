package General;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADITYA
 */
public class overriding
{
public void fun1(int a)
{
    System.out.println("Fun1");
}
public static void fun2(int b)
{
    System.out.println("Fun2");
}
}
class overriding1 extends overriding
{
public void fun1()
{
    System.out.println("overided Fun1");
}
public static void fun2()
{
    System.out.println("overided Fun2");
}
}


class mingal
{
    public static void main(String []args)
    {
        overriding1 o1=new overriding1();
        o1.fun1();
        overriding1.fun2();
      overriding1.fun2(6);    
   o1.fun1(3);
    }}