/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les26_DI_Staticmethod;

/**
 *
 * @author Aditya
 */
public class Car 
{
static String carname;
static String year="2000";
public static void setcarname(String nam)
        {
         carname=nam;
        }
public static void setsal(String sal)
        {
      year=sal;
        }
public static void print()
{
    System.out.println("Carname :"+carname+"   Year:"+year);
}
}
