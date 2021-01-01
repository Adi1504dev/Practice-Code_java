/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L2_DependencyInjection;

/**
 *
 * @author Aditya
 */
public class pojo
{
String Gen[];
String gend;
public void setgend(String geder)
{
    gend=geder;
}

public void setgender(String []geder)
{
    Gen=geder;//here values is passed to Set by xml file 
    //note:in xml file last value will be ignored
}
public void hello(String name)
{
    System.out.println("hello "+gend+" :"+name);
}
}
