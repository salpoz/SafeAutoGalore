/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeautogalore;
import java.io.*;

/**
 *
 * @author salaam
 */
public class MotorCycle implements Serializable{
    private String name;
    private String brand;
    private double price;
    private String manufactureDate;
    private String engineCapacity;
    private int discount;
    private double tax;

    public MotorCycle(String name, String brand, double price, String manufactureDate, String engineCapacity, double tax) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.manufactureDate = manufactureDate;
        this.engineCapacity = engineCapacity;
        this.discount = 0;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
    
    

    

    
    
}
