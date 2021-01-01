/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less33_Autowiring_using_jdk_and_Qualifier;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Qualifier;


/**
 *
 * @author Aditya
 */ 
//@Named annotation can be used in place of stereotye annotation (@Component)
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
