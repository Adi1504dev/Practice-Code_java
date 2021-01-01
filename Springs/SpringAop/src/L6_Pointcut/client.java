/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L6_Pointcut;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Aditya
 */
public class client
{
    public static void main(String []a)
    {
        //target
ApplicationContext ap= new ClassPathXmlApplicationContext("L6_Pointcut/File.xml");
//get generated proxy object
Bank b1=(Bank) ap.getBean("l");


        //  int m= b1.Deposit("SBI123", 5000);
    //System.out.println(m);
    int n1=b1.Findamt("SBI123");
    System.out.println(n1);
    }
}
