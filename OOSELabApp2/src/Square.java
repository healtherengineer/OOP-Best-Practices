
public class Square extends Shape{
    
    private double longEdge ;
    private double shortEdge ;
   

    public Square(double longEdge, double shortEdge) {
        this.longEdge = longEdge;
        this.shortEdge = shortEdge;
        this.numberOfEdge = 4 ;
    }

    public double getLongEdge() {
        return longEdge;
    }

    public void setLongEdge(double longEdge) {
        this.longEdge = longEdge;
    }

    public double getShortEdge() {
        return shortEdge;
    }

    public void setShortEdge(double shortEdge) {
        this.shortEdge = shortEdge;
    }

    public int getNumberOfEdge() {
        return numberOfEdge;
    }

    public void setNumberOfEdge(int numberOfEdge) {
        this.numberOfEdge = numberOfEdge;
    }
    
    
    
    
    
    
}
