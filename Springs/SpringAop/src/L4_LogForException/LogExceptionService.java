/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L4_LogForException;


import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodProxy;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

/**
 *
 * @author Aditya
 */
public class LogExceptionService implements ThrowsAdvice{

   



    
    public void afterThrowing(Exception e)
    {
         Log l= LogFactory.getLog(Bank.class); 
    l.info("Before Deposit Method Logger Service");
    
    } 
    
}
