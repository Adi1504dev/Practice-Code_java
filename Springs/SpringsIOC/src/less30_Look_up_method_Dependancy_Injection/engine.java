/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less30_Look_up_method_Dependancy_Injection;

/**
 *
 * @author Aditya
 */
class engine 
{
    String enginename;
    public void setname(String name)
    {
        enginename=name;
    }
    public void getname()
    {
        System.out.println("engine name");
    }
}
