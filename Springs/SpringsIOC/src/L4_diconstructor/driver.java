/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L4_diconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Aditya
 */
public class driver {
    public static void main(String []args)
    {
        //ApplicationContext ap=new ClassPathXmlApplicationContext("L4_diconstructor/diconstructor1.xml");
// ApplicationContext ap=new ClassPathXmlApplicationContext("L4_diconstructor/diconstructor2.xml");
  //ApplicationContext ap=new ClassPathXmlApplicationContext("L4_diconstructor/diconstructor3.xml");
    //ApplicationContext ap=new ClassPathXmlApplicationContext("L4_diconstructor/diconstructor4.xml");    
      ApplicationContext ap=new ClassPathXmlApplicationContext("L4_diconstructor/diconstructor5.xml");
        L4_diconstructor.pojo p=(L4_diconstructor.pojo)ap.getBean("t");
 p.printdata();

    }
    
}