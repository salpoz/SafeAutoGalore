/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeautogalore;

/**
 *
 * @author salaam
 */
public class PriceCalculate {
    private double price;
    private double tax;
    private int discount;
    private double total;

    public PriceCalculate(double price, double tax, int discount) {
        this.price = price;
        this.tax = tax;
        this.discount = discount;
        this.total = 0.00;
    }
    
    public double calculateTax(){
        return (price*tax)/100;
    }
    
    public double calculateDiscount(){
        return (price * discount)/100;
    }
    
    public double getTotal(){
        return price + calculateTax() + calculateDiscount();
    }
    
}
