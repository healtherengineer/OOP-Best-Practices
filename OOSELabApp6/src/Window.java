/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EGE
 */
public class Window extends Product{

    public Window(int id, String name, ProcessClass pc, ProcessClass2 pc2) {
        super(id, name, pc, pc2);
    }

  

    @Override
    void allProcess() {
       this.pc.doProcess();
        System.out.println(" And ");
        this.pc2.doProcess();
        System.out.println(" for Window");
        
    }
    
    
}
