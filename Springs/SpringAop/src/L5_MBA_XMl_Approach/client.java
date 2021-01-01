/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_MBA_XMl_Approach;

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
ApplicationContext ap= new ClassPathXmlApplicationContext("L5_MBA_XMl_Approach/File.xml");
//get generated proxy object
Bank b1=(Bank) ap.getBean("l");

//OR

//ProxyFactoryBean pbf=(ProxyFactoryBean) ap.getBean("l");

//Bank b1=(Bank) pbf.getObject();

//Bank b1=(Bank)pbf.getObject();
        //  int m= b1.Deposit("SBI123", 5000);
    //System.out.println(m);

int n1=b1.Findamt("SBI123");
    System.out.println(n1);
    }
    
    
}
