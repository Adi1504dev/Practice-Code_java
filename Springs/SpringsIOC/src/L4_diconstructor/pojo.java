
package L4_diconstructor;
public class pojo 
{
    String  name,email=null;
    int age=0;
    int phone=0;
    String A=null;
pojo(String Nam)
{
    name=Nam;
}
pojo(int num)
{
    phone=num;
}
pojo(String nam,int phon)
{
   name=nam;
    phone=phon;
}
pojo(String nam, String mail ,int nos )
{
    name=nam;
    email=mail;
    phone=nos;
    
}
pojo(String nam, String mail ,int nos,int ag )
{
    name=nam;
    email=mail;
    phone=nos;
    age=ag;
}

public void printdata()
{
    System.out.println("Your Name is "+name);
      System.out.println("Your Age is "+age);
      System.out.println("Your Mobile Number is :" +phone);
        System.out.println("Your Email is "+email);
        
}
}