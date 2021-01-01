/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adi.y;
import adi.x.*;//* is all class //or u can write class name
/**
 *
 * @author ADITYA
 */
public class package2 {
      public void fun6()
  {
      System.out.println("fun6");
  }
    
}
class mamam extends packaging{
    public static void main(String []args)
    {
        package2 p2=new package2();
        packaging p1=new packaging();
        p1.fun1();//possible without inheritance
       p2.fun6();
       mamam m=new mamam();
       m.fun1();
       m.fun3();//u wont get default here
      
       
    }
}