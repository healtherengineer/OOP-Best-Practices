public class Main {
    public static void main(String[] args) {

        System.out.println("/For Hamburger");
        IOrderBuilder orderBuilder = new HamburgerBuilder();
        Cashier cashier = new Cashier(orderBuilder);
        cashier.buildOrder();
        Product p3 = orderBuilder.getProdcut();
        System.out.println(p3);


        System.out.println("/For Drink");
        orderBuilder = new DrinkBuilder();
        cashier = new Cashier(orderBuilder);
        cashier.buildOrder();
        Product p2 = orderBuilder.getProdcut();
        System.out.println(p2);


    }
}