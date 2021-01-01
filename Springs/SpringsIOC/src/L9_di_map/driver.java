/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L9_di_map;


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
        ApplicationContext ap=new ClassPathXmlApplicationContext("L9_di_map/di.xml");
    car c=(car)ap.getBean("T");
    c.print();
}
}