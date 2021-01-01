/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L2_DependencyInjection;

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
try{ ApplicationContext ap=new ClassPathXmlApplicationContext("L2_DependencyInjection/dependencyInjection.xml");
 pojo p=(pojo)ap.getBean("t");
 p.hello("Aditya");
}
catch(Exception e)
{
    System.out.println(e.getMessage());
}
         }
}
