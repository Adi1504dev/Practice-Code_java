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
public class method_overloading {
  int g , h ,q;
    method_overloading()
   {
       System.out.println("contructor of method overloading");
   }
      method_overloading(int x)
   {
       System.out.println("contructor of method overloading with parameter");
   }
      public void funs()
    {
        System.out.println("Funs");
    }    public  void fun1()
    {
        System.out.println("Fun1");
    }
        public void fun2()
    {
        System.out.println("Fun2");
    }
           public void fun2(int a)
    {
        System.out.println("Fun3");
    }
                public void funk()
    {
        System.out.println("Fun4");
    }
}

class method_overriding extends  method_overloading {
  method_overriding()
   { 
       super(10);//this used to call paramiterised conttuctor only agar ye na ho aur sirf paramiterised 
       //constructor ho to error aa jayegi bcoz by defalut non perameterised constructor dhundha jayega
       System.out.println("contructor of method overriding");
   }  
    public void funs()
    {
        System.out.println("Funs1");
    }    public  void fun1(int x)
    {
        System.out.println("Fun12");
    }
                public void funk()
    {
        System.out.println("Fun13");
    } 
}
class mainia
{
    public static void main(String a[])
    {
         method_overloading mo=new  method_overloading();//isme bas parent conttructor call hoga bt
         method_overriding mr=new method_overriding();//isme pehle parent constructor call hoga then child cons
         //overloading
         mo.fun2();
 mo.fun2(3);
        mr.funs();//prefferance of local function
         //overriding
        mr.fun1();
         mr.fun1(5);
        //why to use overriding??
        //jab hume main method main ek hi object bana dono hi function ko acess ker sakte hai 
        //lets see how
        mo.funk();
        mr.funk();
        //mr=new method_overloading(); //this is cstinng of object 
        //now why it is wrong??
        //mr is child class so it object can not be casted to use function of parent class bt vice versa is true
       mo=new method_overriding();
        mo.funk();
         
    }
}