/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L4_LogForException;



import org.springframework.aop.framework.ProxyFactoryBean;

/**
 *
 * @author Aditya
 */
public class client
{
    public static void main(String []a)
    {
        //target
Bank b=new Bank();

//Service
LogExceptionService  l=new LogExceptionService ();
ProxyFactoryBean pbf=new ProxyFactoryBean ();
pbf.setTarget(b);
String a1[]={};
pbf.addAdvice(l);

//get generated proxy object
Bank b1=(Bank)pbf.getObject();//get object returns pbf object so in xml returns ProxyFactoryBean(child of bank) bject it can be passed to bank
          int m= b1.Deposit("SBI123", 5000);//replace 4 with 3 to see the change
    System.out.println(m);
    }
}
