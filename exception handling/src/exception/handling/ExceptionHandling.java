/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.handling;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macstudent
 */
public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a ,b, c;
        a=10;
        b=2;
        System.out.println("first line");
        
        
        try{
        
        c= a/b;
        
        
        int x = Integer.parseInt("10");
        
        
        System.out.println("c = "+c);
        
        //throw new ArithmeticException("remove");
        throw new ClassCastException("removed");
        
        
        }
        //catch(Exception e){
          //  System.out.println(e.printStackTrace());
            
       // }
        
        
       catch(Exception e){
        
        
         System.out.println("Exception ");
         
        }
        
        //finally{
         //   System.out.println("i am in final block");
       // }
        
        System.out.println("end");
        
       
        System.out.println();
        
        
        
        double balance = -500;
        
        
        
        if (balance>0)
        {
            try {
                throw new negativeStartingBalance();
            } catch (negativeStartingBalance ex) {
                System.out.println(ex.getMessage());
               
            }
        }
        
    }
    
    
    
    
    String getMyname() throws NullPointerException,IOException
    {
        String s= "hello";
        return s;
  
    }
    
}
