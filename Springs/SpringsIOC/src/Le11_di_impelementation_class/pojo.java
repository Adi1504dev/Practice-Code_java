/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Le11_di_impelementation_class;

import java.util.*;

/**
 *
 * @author Aditya
 */
public class pojo 
{
Vector Fruits;  
TreeSet Cricketer;
Hashtable cc;
public void setfruit(Vector frit)
{
    Fruits=frit;
}
public void setcricketer(TreeSet cri)
{
    Cricketer=cri;
}

        public void setcc(Hashtable c)
{
   cc=c;
}

public void print()
{
    System.out.println("---------------------------Fruits------------------------");
    for(Object fru:Fruits)
    {
        System.out.println(fru.toString());
    }
    System.out.println("---------------------------Cricketers------------------------");
    for(Object cri:Cricketer)
    {
        System.out.println(cri.toString());
    }
   System.out.println("---------------------------Country-Capital------------------------");
    Set keys=cc.keySet();
     for(Object key:keys)
    {
        System.out.println("KEY :"+key +"\t"+"Value :"+cc.get(key));
    }
    
}
}
 