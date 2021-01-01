
package adi.x; /*//here data is inside adi folder then inside x folder
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADITYA
 */
public class packaging
{
  public void fun1()
  {
      System.out.println("public");
  }
    private void fun2()
  {
      System.out.println("private");
  }  protected void fun3()
  {
      System.out.println("protected");
  }
      void fun4()
  {
      System.out.println("Default");
  }
    
non_packaging np=new non_packaging();
}
class non_packaging
{
  public void fun5()
  {
      System.out.println("fun5");
  }
    private void fun6()
  {
      System.out.println("fun6");
  }  protected void fun7()
  {
      System.out.println("fun7");
  }
      void fun8()
  {
      System.out.println("fun 8");
  }
     
}
