/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EGE
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        ProcessClass pc = new ProcessClass();
               ProcessClass2 pc1 = new ProcessClass2();

        Product product1 = new Door(1, "Door 1", pc ,pc1);
        Product product2 = new Window(2, "Window 1", pc,pc1);
        Product product3 = new WoodToy(3, "Wood Toy", pc,pc1);
        product1.allProcess();
        product2.allProcess();
        product3.allProcess();


        
    }
    
}
