
public abstract class Shape {

    protected int numberOfEdge =0;

  
    public int getNumberOfEdge() {
        return numberOfEdge;
    }

    public void setNumberOfEdge(int numberOfEdge) {
        this.numberOfEdge = numberOfEdge;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shape{");
        sb.append('}');
        return sb.toString();
    }
    
}
