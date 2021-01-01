/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L3_disetter;

/**
 *
 * @author Aditya
 */
public class pojo 
{
    String  name,email;
    int age;
    String A;
public void setName(String Nam)
{
    name=Nam;
}
public void setemail(String Email)
{
    email=Email;
}
public void setage(int ag)
{
    age=ag;
}

public void printdata()
{
    System.out.println("Your Name is "+name);
      System.out.println("Your Age is "+age);
        System.out.println("Your Email is "+email);
        
}
}
