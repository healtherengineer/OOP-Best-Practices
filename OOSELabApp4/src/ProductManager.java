
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProductManager implements IProductManager {

    @Override
    public void buy(Product product) {
       
        if(product.getQuantity()!= 0 ){
            try {
                product.setQuantity(product.getQuantity() - 1);
                System.out.println("You have bought a " + product.toString());
                System.out.println("Please wait for 3 seconds to complete your proccess");
                Thread.sleep(3000);
                System.out.println("Order is completed ...");
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
           
            System.out.println(product.toString() + " is sold out ! Unfortuanately");
            System.out.println("Your order is canceled.");
        }
        
        
        
    }

    @Override
    public void showProducts(ArrayList<Product> list) {
        
        for(int i = 0 ; i < list.size() ; i++){
            System.out.println( i++ + " - "+list.get(i).toString() );
        }
       
    }

    @Override
    public void inspectProduct(Product product) {
        System.out.println(product.toString() +" is being inspecting ...");
    }
    
}
