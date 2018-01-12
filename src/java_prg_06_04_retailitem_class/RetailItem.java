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
public class RetailItem {
    /**
     * @param strDescription String description of the item type.
     * @param intUnitsOnHand Total number of items on hand.
     * @param dblPrice Double value to hold item's price.
     */
    
    private String strDescription;
    
    private int intUnitsOnHand;
    
    private double dblPrice;
    
    /**
     * Constructor that fills all three parameter values on creation.
     * @param description Item description.
     * @param units Units on hand.
     * @param price Item price.
     */
    public RetailItem(String description, int units, double price) {
        strDescription = description;
        intUnitsOnHand = units;
        dblPrice = price;
    }
    
    /**
     * No-arg constructor
     */
    public RetailItem() {
        strDescription = "";
        intUnitsOnHand = 0;
        dblPrice = 0.0;
    }
    
    public void setDescription(String description) {
        strDescription = description;
    }
    
    public String getDescription() {
        return strDescription;
    }
    
    public void setUnits(int units) {
        intUnitsOnHand = units;
    }
    
    public int getUnits() {
        return intUnitsOnHand;
    }
    
    public void setPrice(double price) {
        dblPrice = price;
    }
    
    public double getPrice() {
        return dblPrice;
    }
}
