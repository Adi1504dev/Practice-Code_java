/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Le19_c_namespace;



/**
 *
 * @author Aditya
 */
public class car 
{
 String car;
 engine e;
 car(String nam,engine e1)
 {
     car=nam;
     e=e1;
 }
 
 public void print()
 {
     System.out.println("Carname :"+car+"      Year:"+e.year);
 }
 
}