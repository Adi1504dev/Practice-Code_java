package General;


import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADITYA
 */
public class super_keyword_use
{
public void fun1(int x)
{
 System.out.println("fun1");
} 
public void fun2()
{
 System.out.println("fun1");
}
}
class super_keyword_use1 extends super_keyword_use
{
public void fun1()
{
    super.fun1(12);
    super.fun2();
System.out.println("fun3");
} 
public void fun4()
{
 System.out.println("fun4");
}
}
class jad
{
    public static void main(String []args)
    {
       super_keyword_use1 sk1=new super_keyword_use1();
       sk1.fun1();
    }
}