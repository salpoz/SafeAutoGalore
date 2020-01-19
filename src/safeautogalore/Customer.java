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
public abstract class Customer implements Serializable{
    private String name;
    private String address;
    private String telephone;
    private String email;
    private boolean isIndividual;
    private String password;
    private double paymentBalance;

    public Customer(String name, String address, String telephone, String email) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
        this.isIndividual = true;
        this.password = null;
        this.paymentBalance = 0;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isIsIndividual() {
        return isIndividual;
    }

    public void setIsIndividual(boolean isIndividual) {
        this.isIndividual = isIndividual;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getPaymentBalance() {
        return paymentBalance;
    }

    public void setPaymentBalance(double paymentBalance) {
        this.paymentBalance = paymentBalance;
    }
    
}
