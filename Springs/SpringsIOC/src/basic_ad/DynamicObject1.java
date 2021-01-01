package basic_ad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aditya
 */
public class DynamicObject1{
    void fun()
    {
        System.out.println("SucessfuI");
        
    }
    
}
class b
{
    public static void main(String a[]) throws Exception
    {
    DynamicObject1 a1=(DynamicObject1)Class.forName(a[0]).newInstance();// run using cmd only
        a1.fun();
  //typecasting
        /*String a2= String.valueOf(true);  
      System.out.println(a2);*/
    }
}
