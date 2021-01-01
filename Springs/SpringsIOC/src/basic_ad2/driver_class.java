/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_ad2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


/**
 *
 * @author Aditya
 */
public class driver_class 
{
public static void main(String []args) throws Exception
{
    //gives error illeagal access exception
        /*Object p=Class.forName("basic_ad2.pojo1").newInstance();
        pojo1 p1=(pojo1)p;
        p1.hello();*/
    
    
    //creating object of public class
    //Object p3=Class.forName("basic_ad2.pojo").newInstance();
    //pojo p2=(pojo)p3;
   //p2.hello();
   
   
   //acessing done by springs
     Class p4=Class.forName("basic_ad2.pojo1");
    Constructor con[]=p4.getDeclaredConstructors();
    con[0].setAccessible(true);
  Object p8=con[0].newInstance("fiif");
    Method m[]=p4.getDeclaredMethods();
    m[0].setAccessible(true);
  m[0].invoke(p8, null);
    
}
}
