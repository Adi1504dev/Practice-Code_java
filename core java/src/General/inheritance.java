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
public class inheritance 
{
  public static void funs()
    {
        System.out.println("Funs");
    }    public  void fun1()
    {
        System.out.println("Fun1");
    }
        private void fun2()
    {
        System.out.println("Fun2");
    }
            protected void fun3()
    {
        System.out.println("Fun3");
    }
                 void fun4()
    {
        System.out.println("Fun4");
    }}
class inheritance2 extends inheritance
{
        public void fun5()
    {
        System.out.println("Fun5");
    }
        public void fun6()
    {
        System.out.println("Fun6");
    }
            public void fun7()
    {
        System.out.println("Fun7");
    }
                public void fun8()
    {
        System.out.println("Fun8");
    }
}
/*class inheritance3 extends inheritance extends inheritance2 //this thing is wrong chahe tum inheritanc2  main extends use karo chahe nai
{
        public void fun9()
    {
        System.out.println("Fun9");
    }
        public void fun10()
    {
        System.out.println("Fun10");
    }
            public void fun11()
    {
        System.out.println("Fun11");
    }
                public void fun12()
    {
        System.out.println("Fun12");
    }
}*/
/*class maink
{
public static void main(String []args)
{
 inheritance2 in=new inheritance2();   
 in.fun3();
 in.fun4();
 in.fun1();
 in.fun6();
 in.fun7();
 in.fun8();
 in.fun5();
 inheritance.funs();
 inheritance2.funs();//1.this impp static fuction also get inherited
}//2.private dont get inherited
}*/