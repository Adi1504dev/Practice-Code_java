/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les28_3_Factory_class_BY_Factroy_Bean;

import org.springframework.beans.factory.FactoryBean;



/**
 *
 * @author Aditya
 */
public class Car_Factory implements FactoryBean
{
     static Car c=null;
    private static String car;
public  void  setcarname(String car1) 
{
    car=car1;
}

    @Override
    public Object getObject() throws Exception {
        return (Car)Class.forName(car).newInstance();
    }

    @Override
    public Class getObjectType() {
     return Car.class;   
    }
    @Override
    public boolean isSingleton() {
        return true;
    }

}
