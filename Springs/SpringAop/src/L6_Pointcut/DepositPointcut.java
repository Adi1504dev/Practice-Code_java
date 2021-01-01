/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L6_Pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

/**
 *
 * @author Aditya
 */
public class DepositPointcut extends StaticMethodMatcherPointcut
{

    @Override
    public boolean matches(Method method, Class<?> type) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    if(method.getName().equals("Deposit"))
        return true;
    else
        return false;
    }
    
}
