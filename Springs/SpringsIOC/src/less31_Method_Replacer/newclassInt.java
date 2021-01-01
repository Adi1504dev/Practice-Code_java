/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less31_Method_Replacer;
import java.lang.reflect.*;
import org.springframework.beans.factory.support.MethodReplacer;
/**
 *
 * @author Aditya
 */
public class newclassInt implements MethodReplacer{

    @Override
    public Object reimplement(Object o, Method method, Object[] os) throws Throwable {
        System.out.println("This is new intrest class "+os[0]+os[1]);//using the parameters
       return null;
    }
    
}
