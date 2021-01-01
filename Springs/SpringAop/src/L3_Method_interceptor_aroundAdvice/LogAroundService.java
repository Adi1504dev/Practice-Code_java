/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L3_Method_interceptor_aroundAdvice;


import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodProxy;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author Aditya
 */
public class LogAroundService implements MethodInterceptor{

   



    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    Log l= LogFactory.getLog(Bank.class);
    // System.out.println("Deposit Method Logger Service");
    l.info("Before Deposit Method Logger Service");
    Object ret=mi.proceed();//REturn int but converted to Object
    l.info("After Deposit Method Logger Service");
        return ret;
    }
    
}
