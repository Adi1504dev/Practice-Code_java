/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L1_AopProgramatic_approach_MBA;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author Aditya
 */
public class LogBeforeService implements MethodBeforeAdvice{

    @Override
    public void before(Method method, Object[] os, Object o)  {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    Log l= LogFactory.getLog(Bank.class);
     System.out.println("Deposit Method Logger Service");
    l.info("Deposit Method Logger Service");
   
    }
    
}
