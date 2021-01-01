/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L6_di_Seconday_dt;

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
        /*ApplicationContext ap=new ClassPathXmlApplicationContext("L6_di_Seconday_dt/disec.xml");
    car c=(car)ap.getBean("T");
    c.print();
*/
        
        //METHOD 2
        //Loading Multiple Xml File
        
       /* String file[]=new String[]{"L6_di_Seconday_dt/disec2_1.xml" ,"L6_di_Seconday_dt/disec2_2.xml"};
        ApplicationContext ap=new ClassPathXmlApplicationContext(file);
         car c=(car)ap.getBean("T");
    c.print();*/
        
        //METHOD 3 USING INNER BEAN
        ApplicationContext ap=new ClassPathXmlApplicationContext("L6_di_Seconday_dt/disec3.xml");
    car c=(car)ap.getBean("T");
    c.print();
        
        
    }
}
