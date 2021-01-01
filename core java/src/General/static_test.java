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
public class static_test {
    public static void fun1()
    {
        System.out.println("fun1");
    }
        public void fun3()
    {
        System.out.println("fun3");
    }
            public static void fun2()
    {
        System.out.println("fun2");
    }
                public static void main(String []a)
    {
        fun1();
        fun2();
        static_test.fun1();
        static_test t2=new static_test();
        t2.fun3();
        
    }
    
}
