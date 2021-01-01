package General;


import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADITYA
 */
public class Strings_and_math_class {
    
    public static void main(String []args)
    {
        String gh="Shobhita"+"ditya";
        gh=gh.concat("singh");
        System.out.println(""+gh);
       String s="Aditya"+10+"Shobhita";
                System.out.println(""+s);
                       s="Aditya"+10+20+"Shobhita";
                System.out.println(""+s);
                s=20+10+"Aditya"+"Shobhita";
                System.out.println(""+s);
         s="Aditya"+10+20;
        System.out.println(""+s);
        s=10+ 24+"Aditya"+10+"Shobhita";//mind its output
        System.out.println(""+s);//result is 34Aditya10Shobhita and not 1024Aditya10Shobhita
        s="10"+24+"Aditya"+10+"Shobhita";//now output is 1024Aditya10Shobhita
        System.out.println(""+s);
        String hj="kiku";
        System.out.println(""+hj);
hj="piku";
System.out.println(""+hj);
        //object data type,It is a refferance datatype
        //Object datatype has really large value
        //this can store any value and they cant be later type casted
      Object a=4.5;
       Object b=4;
       Object c="Aditya";
       Object d='a';
       System.out.println(""+a+b+c+d);
       double u=11.3;
       Object v=u;//implicit type casting (boxing)
       double k=(double)u;//explicit type castitng(unboxing)
  Object kl=19;
  double jl=(int)kl;
       k=u+2.33;
       System.out.println(""+k);
       System.out.println(""+v);
      
     String f="ADITYA Singh";
        //other way of defining string
        String e= "aditya";
String f1="ADITYA Singh";//here f and f1 are in constant pool as the way in which they are defined the data
// is saved in constant pool as they have same value ADITYA Singh
String e1=new String("aditya");
//here e and e1 are saved in heap and e an e1 points to the different thing
String e2=e.concat(f);//here value of e2 changes not e1 or f 
String e3=new String("aditya");
System.out.println(e2);

           System.out.println(f1==f);
           System.out.println(e1==e3);
           System.out.println(""+f.concat(" Singh"));
       System.out.println(""+f);//THERE is no change in f mind it
       System.out.println(""+f.toLowerCase(Locale.ITALY));
       System.out.println(""+f.intern());
         System.out.println(""+f.charAt(2));
       System.out.println(""+f.replace('A', 'a'));
       System.out.println(""+f.toUpperCase());
       System.out.println(""+f.replaceAll("Singh", "bing"));
       System.out.println(""+f.substring(2, 5));
       System.out.println(""+f.length());
       System.out.println(""+f.matches("ADITYA Singh"));
    /* System.out.println(e.equals(e1));
    System.out.println(e==e1);//this  checks the location instead of value and e is in constant pool
    //and e1 is in heap
       System.out.println(e3==e1);       //this is because in heap also they are saved in different location
//gotthrough notes 
System.out.println(e3.equals(e1));//now due to value comaparison they are equal  */
// There are many more Function to print String 
       //now for the cocept of immutable String
       //defining string by String Buffer
      //these are String  are use to create variable String and for that Buffer class is used
      StringBuffer sc=new StringBuffer("Aditya");
      sc.append("Aditya");
      System.out.println(""+sc);
      sc.append(3);//there are many function fro sc as well which can be used
     System.out.println(""+sc);
    
   System.out.println(""+sc.subSequence(2, 4));
sc.insert(4, "shobhi");
System.out.println(""+sc);
      String r1="REAL";
      r1=r1 + " unreal";
      r1=r1.concat(" Singh");
      f=f.concat("ad");
      System.out.println(""+r1);
        System.out.println(""+f);
          System.out.println(""+sc);
          //Math class
          double ul;
          ul=Math.ceil(-4.8);
          System.out.println(""+ul);
          ul=Math.cos(60);
          System.out.println(""+ul);
          ul=Math.pow(3, 4);
          System.out.println(""+ul);
          //Similary there are many fuction which can be learned with time
       
       
       
       
    }
}
