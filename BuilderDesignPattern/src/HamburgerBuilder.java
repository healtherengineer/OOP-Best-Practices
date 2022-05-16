public class HamburgerBuilder implements  IOrderBuilder{

    public final Product product = new Product("Hamburger");
    @Override
    public void prepareOrder() {
        System.out.println(product+" is being prepared");
    }

    @Override
    public void serveOrder() {
        System.out.println("Here is your"+ product + "Enjoy your meal");

    }

    @Override
    public Product getProdcut() {
        return product;
    }
}
