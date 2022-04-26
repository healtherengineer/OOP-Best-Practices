/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EGE
 */
public abstract class Product {

    protected int id;
    protected String name;
    protected ProcessClass pc;
    protected ProcessClass2 pc2;

    public Product(int id, String name, ProcessClass pc, ProcessClass2 pc2) {
        this.id = id;
        this.name = name;
        this.pc = pc;
        this.pc2 = pc2;
    }

   

    abstract void allProcess();

}
