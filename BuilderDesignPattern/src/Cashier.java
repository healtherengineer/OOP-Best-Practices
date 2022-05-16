public class Cashier {
    IOrderBuilder orderBuilder ;

    public Cashier(IOrderBuilder orderBuilder) {
        this.orderBuilder = orderBuilder;
    }
    public void buildOrder(){
        this.orderBuilder.prepareOrder();
        this.orderBuilder.serveOrder();
    }
}
