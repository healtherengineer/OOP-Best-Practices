/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EGE
 */
public abstract class Operation {
    protected double value1 ;
    protected double value2 ;
    public Operation(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
      
    }

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }
    
    public abstract double getResult();
    
}
