/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author ADITYA
 */
public class generics_class <T,F>//more than one place holders can be given
{
public T a(T q,F w)//return type T
{
    System.out.println(q+"\n"+w);
    return q;
}
}
class sadad
{
    public static void main(String []args)
    {
        generics_class<Integer,String> g=new generics_class<Integer,String>();
         generics_class<String,Integer> g1=new generics_class<String,Integer>();
        String b,a="Aditya";
        Integer k,h=9;//only class not premitives
        k=g.a(h, a);
        b=g1.a(a, h);
        g.a(h, a);
    }
}
