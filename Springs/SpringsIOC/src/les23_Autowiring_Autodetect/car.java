/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les23_Autowiring_Autodetect;



/**
 
 * @author Aditya
 */
public class car 
{
String name;
Engine engine;
/*public car()//if not default constructor it will print car name as lamborgini
({//else if there is default constructor car name will be printed as Audi
  
    System.out.println("This is default contructor");
}*/
public car( Engine engine ,String nam)
{
    name=nam;
    this.engine=engine;
    
}
public void setEngine(Engine r)
        
{
   
    engine=r;
}
public void setna(String naa)
        
{
    name=naa;
   
}


public void print()
{
    System.out.println("Carname   :"+name+"     Year"+engine.Year);
}
}
