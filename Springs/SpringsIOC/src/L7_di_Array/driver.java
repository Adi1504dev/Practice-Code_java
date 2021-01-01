/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L7_di_Array;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Aditya
 */
public class driver 
{
    public static void main(String []a)
    {
  //METHOD 1
        ApplicationContext ap=new ClassPathXmlApplicationContext("L7_di_Array/di.xml");
    car c=(car)ap.getBean("T");
    c.print();
}
}