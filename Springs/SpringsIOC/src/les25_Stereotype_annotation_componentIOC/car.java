/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les25_Stereotype_annotation_componentIOC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class car 
{
@Autowired()
Engine engine;




public void print()
{
    System.out.println("Name:"+engine.name+"     Year :"+engine.Year);
}
}
