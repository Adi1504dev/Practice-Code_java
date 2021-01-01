/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Le16_Dependencychecking2_Required_annotation;

import org.springframework.beans.factory.annotation.Required;
//import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
//Above class has to be initiated in xml




/**
 *
 * @author Aditya
 */ 
public class car
{
String carname,carname1;
engine e,e3;
@Required
public void setyear(engine e1)
{
    e=e1;
}
public void setyear1(engine e2)
{
    e3=e2;
}
@Required
public void setname(String nam)
{
    carname=nam;
}
public void setname1(String nam)
{
    carname1=nam;
}
public void print()
{
    System.out.println("Carname :"+carname+"    ModelYear"+e.ModelYear);
}
}
