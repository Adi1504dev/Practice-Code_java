/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less32_Autowiring_by_resource_annotation;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Qualifier;


/**
 *
 * @author Aditya
 */
public class car 
{
    @Resource

    /*
    here the byname technique is used  so it will search for "engine" id in the xm file so no qualifier required 
    */
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
