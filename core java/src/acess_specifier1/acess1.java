/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package acess_specifier1;
import acess_specifier.acess;

class kane
{
    public void fun()
    {
        acess a=new acess();
        a.fun1();
    }
    
    
}
class kane1 extends acess
{
    public void fun()
    {
        kane1 k=new kane1();
        k.fun1();
        k.fun3();
        k.fun5();
        
    }
    
    
}
class main extends acess
{
    public static void main(String args[])
    {
        kane1 k1=new kane1();
        kane k2=new kane();
        acess a=new acess();
        a.fun1();
main m=new main();
m.fun3();//accessed
//a.fun3()//error if not inherited//k1.fun();
               //k2.fun()
    }
    }
