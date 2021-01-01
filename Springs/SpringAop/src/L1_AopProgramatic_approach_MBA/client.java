/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L1_AopProgramatic_approach_MBA;

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
LogBeforeService  l=new LogBeforeService ();
ProxyFactoryBean pbf=new ProxyFactoryBean ();
pbf.setTarget(b);
pbf.addAdvice(l);

//get generated proxy object
Bank b1=(Bank)pbf.getObject();
          int m= b1.Deposit("SBI123", 5000);
    System.out.println(m);
    }
}
