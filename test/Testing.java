/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.*;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
import safeautogalore.PriceCalculate;

/**
 *
 * @author salaam
 */
public class Testing {
    
    public Testing() {
    }
    
    // Test for discount calculation
    @Test
    public void discountTest(){
        PriceCalculate pc = new PriceCalculate(1000.00, 10.00, 5);
        
        assertEquals(50.0, pc.calculateDiscount());
        
    }
    
    
    // Test for tax calculation
    @Test
    public void taxTest(){
        PriceCalculate pc = new PriceCalculate(1000.00, 10.00, 5);
        
        assertEquals(100.0, pc.calculateTax());
    }
    
    
    // Total price calculation
    @Test
    public void totalTest(){
        PriceCalculate pc = new PriceCalculate(1000.00, 10.00, 5);
        
        assertEquals(1150.00, pc.getTotal());
    }
    
}
