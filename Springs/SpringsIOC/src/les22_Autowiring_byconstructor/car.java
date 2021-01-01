/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les22_Autowiring_byconstructor;


/**
 
 * @author Aditya
 */
public class car 
{
String name="audi";
Engine engine;
car( String nam, Engine engine ,int no)
{
    
    this.engine=engine;
    name=nam;
}

public void print()
{
    System.out.println("Carname   :"+name+"     Year"+engine.Year);
}
}
