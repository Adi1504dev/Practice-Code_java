/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Le11_di_impelementation_class;

import L8_di_Set.car;
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
        ApplicationContext ap=new ClassPathXmlApplicationContext("Le11_di_impelementation_class/di.xml");
    pojo c=(pojo)ap.getBean("t");
    c.print();
}
}    

