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
public class thefinalkeyword {
    final public void fun1()
   {
        System.out.println("Fun1");
   }
       public void fun2()
   {
        System.out.println("Fun2");
   }
          public void fun3()
   {
        System.out.println("Fun3");
   }
             public void fun4()
   {
        System.out.println("Fun4");
   }
   
    
}
 class thefinalkeyword2 extends thefinalkeyword  { //first use of final keyword is that this class cannot be further inerited
  //here the fun1 cannot be redefined as it is already finalisze
     //remember one thing more only public class can be inherited
   /*  public void fun1()
   {
        System.out.println("Fun9");
   }*/
       public void fun2()
   {
        System.out.println("Fun10");
   }
          public void fun3()
   {
        System.out.println("Fun11");
   }
             public void fun4()
   {
        System.out.println("Fun12");
   }
   
     class thefinalkeyword1
// extends thefinalkeyword2//this would be wrong  bcoz  thefinalkeyword2 class is already final
    {
    final int x=20;//used to make variable contant
    //x=3;//not can be done
         public void fun1()
   {
        System.out.println("Fun5");
   }
       public void fun2()
   {
        System.out.println("Fun6");
   }
          public void fun3()
   {
        System.out.println("Fun7");
   }
             public void fun4()
   {
        System.out.println("Fun8");
   }
   
     }}
class mam
{
    public static void main(String args[])
    {
        thefinalkeyword2 f2=new thefinalkeyword2();
        f2.fun1();
        
        
    }
}