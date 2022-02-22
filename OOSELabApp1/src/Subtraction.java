/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EGE
 */
public class Subtraction extends Operation {
    

    public Subtraction(double value1, double value2) {
        super(value1, value2);
  
    }

    @Override
    public double getResult() {
        return value1 - value2 ;
       
    }
    
    
}
