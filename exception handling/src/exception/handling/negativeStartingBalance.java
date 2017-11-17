/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.handling;

/**
 *
 * @author macstudent
 */
public class negativeStartingBalance extends Exception {

    public negativeStartingBalance() {
        
        super("error : Negative starting balance");
    }
    
    public negativeStartingBalance(double amount) {
        
        super("error : Negative starting balance"+ amount);
    }
    
     
    
    
    
    
    
    
}
