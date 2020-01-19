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
    private String description;

    public MotorCycle(String name, String brand, double price, String manufactureDate, String engineCapacity, String description) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.manufactureDate = manufactureDate;
        this.engineCapacity = engineCapacity;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
