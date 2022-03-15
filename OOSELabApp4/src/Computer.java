
public class Computer extends Product{

    private String model ;
    private int ram;
    private String cpu;
    
    public Computer(int quantity, String productName, String ProducedDate, String brand
    ,String model,int ram,String cpu) {
        super(quantity, productName, ProducedDate, brand);
        this.model = model ;
        this.ram = ram ;
        this.cpu = cpu;
    }
  
 

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    
    
}
