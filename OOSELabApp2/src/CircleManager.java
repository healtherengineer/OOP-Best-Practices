
public class CircleManager implements ICalculate {
    private Circle circle ;

    public CircleManager(Circle circle) {
        this.circle = circle;
    }

    @Override
    public double calculatePerimeter() {
       double result = this.circle.getRadius() * this.circle.getPI() * 2;
       return result;
    }

    @Override
    public double calculateArea() {
    
        double result = this.circle.getPI() * Math.pow(this.circle.getRadius(), 2.0);
        return result ;
        
    }
    
    
    
    
}
