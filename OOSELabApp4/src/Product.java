
public abstract class Product {
    private int quantity ;
    private String productName ;
    private String ProducedDate;
    private String brand ;

    public Product(int quantity, String productName, String ProducedDate, String brand) {
        this.quantity = quantity;
        this.productName = productName;
        this.ProducedDate = ProducedDate;
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProducedDate() {
        return ProducedDate;
    }

    public void setProducedDate(String ProducedDate) {
        this.ProducedDate = ProducedDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "{productName=" + productName + '}';
    }
    
   
    
    
    
}
