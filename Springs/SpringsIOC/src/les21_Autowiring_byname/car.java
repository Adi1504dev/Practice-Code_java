/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les21_Autowiring_byname;

/**
 
 * @author Aditya
 */
public class car 
{
String name;
Engine engine;//engine=id
public void setname(String nam)
{
    name=nam;
}
public void setEngine(Engine engine)//yaha pe setEngine() (same as class name) hi hona chahiye agr setyear() ya kuch aur hoga to 
 //       nullpointer exception aayegi by test main ye jaruri nai
{   this.engine=engine;
}
public void print()
{
    System.out.println("Carname   :"+name+"     Year"+engine.Year);
}
}
