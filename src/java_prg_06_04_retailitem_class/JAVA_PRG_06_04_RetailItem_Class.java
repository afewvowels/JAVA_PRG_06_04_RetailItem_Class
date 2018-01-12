/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_06_04_retailitem_class;

/**
 *
 * @author bluebackdev
 */
public class JAVA_PRG_06_04_RetailItem_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RetailItem item1 = new RetailItem();
        RetailItem item2 = new RetailItem();
        RetailItem item3 = new RetailItem();
        
        item1.setDescription("Jacket");
        item1.setUnits(12);
        item1.setPrice(59.95);
        
        item2.setDescription("Designer Jeans");
        item2.setUnits(40);
        item2.setPrice(34.95);
        
        item3.setDescription("Shirt");
        item3.setUnits(20);
        item3.setPrice(24.95);
        
        System.out.println(item1.getDescription());
        System.out.println(item1.getUnits());
        System.out.println(item1.getPrice());
        System.out.println("");
        
        System.out.println(item2.getDescription());
        System.out.println(item2.getUnits());
        System.out.println(item2.getPrice());
        System.out.println("");
        
        System.out.println(item3.getDescription());
        System.out.println(item3.getUnits());
        System.out.println(item3.getPrice());
        System.out.println("");
    }
    
}
