
public class Multiple extends Operation{
    
  
    public Multiple(double value1, double value2) {
        super(value1, value2);
   
    }

    @Override
    public double getResult() {
       
        return value1 * value2 ;
    }
    
    
}
