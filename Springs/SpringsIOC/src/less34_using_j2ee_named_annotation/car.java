/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less34_using_j2ee_named_annotation;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


/**
 *
 * @author Aditya
 */ 
//@Named annotation can be used in place of stereotye annotation (@Component)
@Component// here in place of @Component @Named annotation can also be used which in jdk library 
//but i cant use it as There is some error in my jdk library
public class car 
{
    @Resource
    @Qualifier(value="e2")//agr  ye nai hoga to ambiguity aayegi
private Engine engine;
public void setengine(Engine e)
{
    engine=e;
}
public void printdata()
{
    System.out.println("Engine Model Year:" +engine.Year);
}       
}
