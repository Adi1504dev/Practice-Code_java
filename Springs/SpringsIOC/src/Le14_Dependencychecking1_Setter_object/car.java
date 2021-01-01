/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Le14_Dependencychecking1_Setter_object;

/**
 *
 * @author Aditya
 */
public class car
{
String carname;
engine e;
public void setyear(engine e1)
{
    e=e1;
}
public void setname(String nam)
{
    carname=nam;
}
public void print()
{
    System.out.println("Carname :"+carname+"    ModelYear"+e.ModelYear);
}
}
