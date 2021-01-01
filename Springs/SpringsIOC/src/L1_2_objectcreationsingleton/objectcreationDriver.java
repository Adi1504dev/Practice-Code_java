/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L1_2_objectcreationsingleton;


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
       Resource r=new ClassPathResource("L1_2_objectcreationsingleton/objectcreation.xml");
       BeanFactory factory=new XmlBeanFactory(r);
       Object b=factory.getBean("t");
       objectcreationpojo p=(objectcreationpojo)b;//only one object will be created although it seem that there
       //are number of objects being created as the result contructor will also be called once only
        objectcreationpojo p1=(objectcreationpojo)b; //this is called singleton object creation
        objectcreationpojo p2=(objectcreationpojo)b;
    System.out.println(p1==p);
        System.out.println(p1==p2);//checking all the object are pointing to same refferance location
        //or new object is beaing created evey time
      p.hello();
    }
    
}
