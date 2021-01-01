/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L8_di_Set;


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
        ApplicationContext ap=new ClassPathXmlApplicationContext("L8_di_Set/di1.xml");
    car c=(car)ap.getBean("T");
    c.print();
}
}