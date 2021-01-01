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
interface interface_class
//1.isme sare abstract methods hote hai aur isliye isme abstract keyword ko use ki jarurat nai
//2.direct object bi nai create ho sakta        
{
    void fun1();
    void fun2();
    
}
interface interface_class1//interface do not have costructor
//1.isme sare abstract methods hote hai aur isliye isme abstract keyword ko use ki jarurat nai
//2.direct object bi nai create ho sakta        
{
    //int y;//this is not okk as it is not initalised by u nor by defalut constructor
  int x=10;
  //in inerface variable is by default final static and public weather u define of not
    void fun2();//by default public
    void fun3();
}
interface interface_class3 extends interface_class1
//1.kisi bi interface ko dusre interface main dal sakte hai using extend keyword
        //2.kisi bi class ko interface main inherit nai ker sakte kyunki agar aisa hoga interface ki defenition galat ho jayegi
        //3.isme default contructor bi nai hote
{
    
   void fun5();
    void fun6();
}
class test1 implements interface_class,interface_class1
//1. yaha ek tarike se dekha jaye to 2 classes test main inherit hui hai
//2.yaha pe inherit kerte samay implement ka use hota hai

{
   public void fun1()//define kerte samay public likhna jaruri hai
    {
     System.out.println("fun1");
    }
    public void fun2()
    {
System.out.println("fun2");        
    }
     public void fun3()
    {
      System.out.println("fun3");  
    }
}
class manisa
{
    public static void main(String []args)
    {
        test1 t1=new test1();
        t1.fun1();
        t1.fun2();
        t1.fun3();
    }
}
class tisa implements interface_class1,interface_class
        
{
 
     public void fun1()
    {
        System.out.println("tfun1");
    }
    public void fun2()
    {
        System.out.println("tfun2");
    }
    public void fun3()
    {
    System.out.println("tfun3");    
    }
     public void fun31()
    {
    System.out.println("tfun31");    
    }
}
class jania implements interface_class3
{
  public void fun2()
  {
      System.out.println("fun2");
  }
  public void fun3()
  {
      System.out.println("fun3");
  }
  public void fun6()
  {
      System.out.println("fun6");
  }
  public void fun5()
  {
      System.out.println("fun5");
  }
  public static void main(String []args)
  {
      jania j=new jania();
      j.fun2();
      j.fun3();
      j.fun5();
      j.fun6();
      interface_class1 ic1=new tisa();//ic1 is a refferance variable
      ic1.fun2();
      ic1.fun3();
     // ic1.fun1();//error bcoz refferance variable interface class1 ka hai
     
  }
}