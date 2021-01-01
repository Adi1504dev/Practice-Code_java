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
public class papa
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
class beta extends papa
{
    public void fun3()
    {
        System.out.println("fun3");
    }
    public void fun4()
    {
        System.out.println("fun4");
    
}
}

class jinfa
{
      public static void main(String []args)
    {
     papa p=new papa();
     beta b=new beta();
  p=new beta();
 p.fun1();
  
    }
}