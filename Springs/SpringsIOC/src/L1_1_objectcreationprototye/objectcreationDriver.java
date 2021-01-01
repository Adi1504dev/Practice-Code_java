/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L1_1_objectcreationprototye;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author Aditya
 */

public class objectcreationDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       Resource r=new ClassPathResource("L1_1_objectcreationprototye/objectcreation.xml");
       BeanFactory factory=new XmlBeanFactory(r);
       Object b=factory.getBean("t1"); 
       objectcreationpojo p=(objectcreationpojo)b;//multiple objects are creatred
       
        objectcreationpojo p1=(objectcreationpojo)b; //this is called prototype(see differance on xml file) object creation
        objectcreationpojo p2=(objectcreationpojo)b;//
        objectcreationpojo p3=new objectcreationpojo();
        
        /*
        here it is improtant to note that I am not getting the new object refferacnce even by using scope as 
        prototype 
        to get the new object we may directly create an object by noraml way
        */
        
       
    System.out.println(p1==p);
        System.out.println(p1==p2);
        System.out.println(p3==p2);
//checking all the object are pointing to same refferance location
        //or new object is beaing created evey time
      p.hello();
    }
    
}
