/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L3_Method_interceptor_aroundAdvice;



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
LogAroundService  l=new LogAroundService ();
ProxyFactoryBean pbf=new ProxyFactoryBean ();
pbf.setTarget(b);
String a1[]={};
pbf.addAdvice(l);

//get generated proxy object
Bank b1=(Bank)pbf.getObject();
          int m= b1.Deposit("SBI123", 5000);
    System.out.println(m);
    }
}
