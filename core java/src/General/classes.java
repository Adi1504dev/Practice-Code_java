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
public class classes
{
    //class ko use kerne ke liye uska object banana padta hai
    //static bhed bhav kerte hai bs satic ko hi call kerte hai
    static int x;
    int y=7;
    public static void fun1()
    { 
        x=10;
        //y=0;//there is error as function is static and y is non static=>this rule is for member function and variable
        //Z-Rule see in notes
        System.out.println("fun1");
    }

}
class  _nested_class_with_nonstatic_inner_class {
    int x=8;
    static int y=6;
    public  void fun2()
    {        System.out.println("fun2");
    }
    public void fun3()
    {        System.out.println("fun3");
    }
    class bb
    {
        public void fun5()//here no function can be static
    {        System.out.println("fun5");
    System.out.println(""+y);
    System.out.println(""+x);
        }
        public void fun6()
    {        System.out.println("fun6");
    }
    }
    
}
class _nested_class_with_static_inner_class {
   int x=8;  
   static int m=9;
    public  void fun7()
    {        System.out.println("fun7");
    }
    public void fun8()
    {        System.out.println("fun8");
    }
   static class kk
    {
        
        _nested_class_with_static_inner_class k1=new _nested_class_with_static_inner_class ();
       
       int z;  
       
        public static void fun9()//here function can be static
    {        System.out.println("fun9");
   // _nested_class_with_static_inner_class k1=new _nested_class_with_static_inner_class ();
    }
        public void fun10()
        {
        int z1=k1.x+4;    
       int  z2=m+3;//bcoz m is static so no need to create object u can dirrectly use it
           System.out.println("fun10");
    }
    }
    
}
class class_inside_the_function
{
    int x=99;
    static int y=67;
    public  void fun11()
    {        System.out.println("fun11");
    }
    public void fun12()
    {        System.out.println("fun12");
    }
    public void fun13()
    {
    class bb //this class can not be static nor its  funtions can be 
    {
        public void fun14()//here no function can be static
    {        System.out.println("fun14");
    System.out.println(""+y);
    System.out.println(""+x);//this bcoz class is non static
    }
        public void fun15()
    {        System.out.println("fun15");
    }
      
    }
    bb b1=new bb();
    b1.fun14();
    b1.fun15();
    }    
}
class mintra
{
    public static void main(String []args)
    {
 //class with non static inner class
  
       _nested_class_with_nonstatic_inner_class a1=new _nested_class_with_nonstatic_inner_class();//outer class will take outer members
//here without making object of inner class we can not get to make object of inner class as it is not static
        a1.fun2();
a1.fun3();
a1.x=4;
_nested_class_with_nonstatic_inner_class.bb b1=a1.new bb();//inner class will take inner members
b1.fun5();
b1.fun6();
        _nested_class_with_static_inner_class  n2=new _nested_class_with_static_inner_class ();
        n2.fun7();n2.fun8();
       _nested_class_with_static_inner_class.kk m1=new _nested_class_with_static_inner_class.kk();
       m1.fun9();m1.fun10();
      //classes inside the function
               class_inside_the_function c1=new  class_inside_the_function();//outer class will take outer members
//here we are not at all concerned with inner class as it is local issue of fun13
c1.fun11();c1.fun12();c1.fun13();
      
    }
}