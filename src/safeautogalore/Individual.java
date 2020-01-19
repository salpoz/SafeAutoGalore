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
public class Individual extends Customer implements Serializable{
    private String licenseNo;

    public Individual(String name, String address, String telephone, String email, String license) {
        super(name, address, telephone, email);
        this.licenseNo = license;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    
    
}
