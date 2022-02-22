
public class SquareManager implements ICalculate {

    private Square square;

    public SquareManager(Square square) {
        this.square = square;
    }

    @Override
    public double calculatePerimeter() {

        double result = this.square.getLongEdge() * 2 + this.square.getShortEdge() * 2;

        return result;
    }

    @Override
    public double calculateArea() {

        double result = this.square.getLongEdge() * this.square.getShortEdge();
        return result;

    }
    

}
