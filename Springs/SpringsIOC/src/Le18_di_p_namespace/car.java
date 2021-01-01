/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Le18_di_p_namespace;

/**
 *
 * @author Aditya
 */
public class car 
{
 String car;
 engine e;
 public void setcarname(String nam)
 {
     car=nam;
 }
 public void setyear(engine e1)
 {
     e=e1;
 }
 public void print()
 {
     System.out.println("Carname :"+car+"      Year:"+e.year);
 }
 
}