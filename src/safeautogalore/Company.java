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
public class Company extends Customer implements Serializable{
    private String regNo;
    
    
    public Company(String name, String address, String telephone, String email, String regNo) {
        super(name, address, telephone, email);
        this.regNo = regNo;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }
    
}
