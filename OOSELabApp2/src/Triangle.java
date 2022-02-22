
public class Triangle extends Shape {
    private double edge1 ;
    private double edge2 ;
    private double edge3 ;
    private double height ;

    public Triangle(double edge1, double edge2, double edge3 ,double height) {
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
        this.height = height;
        this.numberOfEdge = 3;
    }

    public double getEdge1() {
        return edge1;
    }

    public void setEdge1(double edge1) {
        this.edge1 = edge1;
    }

    public double getEdge2() {
        return edge2;
    }

    public void setEdge2(double edge2) {
        this.edge2 = edge2;
    }

    public double getEdge3() {
        return edge3;
    }

    public void setEdge3(double edge3) {
        this.edge3 = edge3;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
}
