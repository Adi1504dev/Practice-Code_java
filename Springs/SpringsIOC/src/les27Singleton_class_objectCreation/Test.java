/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les27Singleton_class_objectCreation;

/**
 *
 * @author Aditya
 */
 class Test
{
    private static Test t=null;
private  Test() 
{

}
public void show()
{
    System.out.println("The object of test created");
}
public static Test getInstance() throws Exception
{
    if (t==null)
    {
        Test t=(Test) Class.forName("les27Singleton_class_objectCreation.Test").newInstance();
    return t;
    }
    else
    {
        return t;
    }
}
protected Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException();
}
}


