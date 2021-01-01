package General;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADITYA
 */
abstract public class Abstract_class1//important to have abstract word here
//1.u cant create its object//2.it is always public//3.they are inherited and abstract funtion is defined their
//incase koi class abstract ho to uska object nai banega chahe usme koi abstract fuction na ho
{
   Abstract_class1()//do have contructor
   {
       //some code
   }
public void fun1()
{
System.out.println("fun1");
}
public void fun2()
{
System.out.println("fun2");
}
abstract public void fun3();//important to have abstract word here

}
class cri extends Abstract_class1//here it becomes necessary to define the extract funtion
        //as soon as u inherit it here or else this class should also be abstract
{
    public void fun3()
    {
System.out.println("fun3");
    }    
    public static void main(String []args)
    {
     cri f=new cri(); //object sirf child class ka banega
    f.fun1();
    f.fun2();
    f.fun3();
    }
}