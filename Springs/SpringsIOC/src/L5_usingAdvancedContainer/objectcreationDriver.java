/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_usingAdvancedContainer;




import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;



/**
 *
 * @author Aditya
 */

public class objectcreationDriver {

    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException
    {
    
        ApplicationContext ap=new ClassPathXmlApplicationContext("L5_usingAdvancedContainer/objectcreation.xml");
    
    /*
       by runnig the file we may say that instance of sigleton class are created at the time of loading of 
       xml file itself
       */
    objectcreationpojo1 p=(objectcreationpojo1)ap.getBean("t1");
    p.hello();
    
    
            //the below line gives error as the object creation of class  with private  contructor is not possible
            //simply bt by using Springs we can create object eaisly
            //objectcreationpojo3 p3=new objectcreationpojo3();

   objectcreationpojo3 p1=(objectcreationpojo3)ap.getBean("t3");//objectcreationpojo3 has private constructor
    p1.hello();
    }
    
}
