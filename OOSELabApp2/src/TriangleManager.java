
public class TriangleManager implements ICalculate{
    private Triangle triangle ;

    public TriangleManager(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double calculatePerimeter() {
    
        double result = this.triangle.getEdge1() + this.triangle.getEdge2() + this.triangle.getEdge3() ;
        return result ;
        
    }

    
    @Override
    public double calculateArea() {
        double result = this.triangle.getHeight() * this.triangle.getEdge3();
        return result;
    }
    
    
}
