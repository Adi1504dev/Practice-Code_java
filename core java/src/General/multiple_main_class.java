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
public class multiple_main_class 
{
    public void fun1()
    {
        System.out.println("fun1");    

    }
public void fun2()
    {
        System.out.println("fun2");    
    }
}
class test31
{
    public static void main(String []args)
    {
        multiple_main_class t3=new multiple_main_class();
        t3.fun1();
    }
}
class test32
{
    public static void main(String []args)
    {
        multiple_main_class t3=new multiple_main_class();
        t3.fun2();
    }
}