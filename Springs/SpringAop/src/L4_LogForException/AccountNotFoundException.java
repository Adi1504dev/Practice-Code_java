/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L4_LogForException;







/**
 *
 * @author Aditya
 */
public class AccountNotFoundException extends RuntimeException {
    @Override
    public String toString()
    {
        return "Account not Found";
    }
    
}
