
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        Product product1 = new Computer(5, "Asus Computer", "15/03/2022", "", "Notebook 12.3", 16, "Intel i7");
        Product product2 = new Computer(5, "Lenova  Computer", "15/03/2022", "", "Notebook 12.4", 16, "Intel i7");
        Product product3 = new Computer(5, "Monster Computer", "15/03/2022", "", "Notebook 12.3", 16, "Intel i7");
        Product product4 = new Computer(5, "Casper Computer", "15/03/2022", "", "Notebook 12.3", 16, "Intel i7");
        Product product5 = new Computer(5, "Apple Computer", "15/03/2022", "", "Mac 12.3", 16, "M1");
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        ProductManager productManager = new ProductManager();
        productManager.inspectProduct(product1);
        System.out.println(product1.getQuantity());
        productManager.buy(product1);
        System.out.println(product1.getQuantity());

        productManager.inspectProduct(product1);

    }

}
