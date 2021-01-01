/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acess_specifier;

/**
 *
 * @author ADITYA
 */
public class acess {
        public void fun1()
    {
        System.out.println("public");
    }
        private void fun2()
    {
        System.out.println("private");
    }
            protected void fun3()
    {
        System.out.println("protected");
    }
                void fun4()
    {
        System.out.println("default");
    }
                   public void fun5()
    {
        acess a=new acess();
        a.fun1();a.fun2();a.fun3();a.fun4();
    }
 
}
class main
{
    public static void main(String []args)
{
        acess a=new acess();
        a.fun5();
        a.fun1();
        a.fun3();a.fun4();//a.fun2();
}
}