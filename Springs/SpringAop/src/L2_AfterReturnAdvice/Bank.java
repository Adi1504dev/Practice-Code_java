/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L2_AfterReturnAdvice;



/**
 *
 * @author Aditya
 */
public class Bank 
{private int amount=5000;
private String at="SBI123";
public int Deposit(String acna,int amt)
{
    if(acna.equals(at))
    {
            System.out.println("Inside Deposit Method ");
        amount=amt+amount;
           
        return amount;
     
        
    }
    else
    {
        throw new AccountNotFoundException();
    }
}
    
    
}
