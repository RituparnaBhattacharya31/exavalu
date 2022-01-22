/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts2.test.dao;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import struts2.test.beans.Product;
import struts2.test.beans.User;

/**
 *
 * @author ritup
 */
public class AdminTest {
    
    public AdminTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of registerUser method, of class Admin.
    
    @Test
    public void testRegisterUser() throws Exception {
        System.out.println("registerUser");
        String userName = "test123";
        String password = "12345";
        String firstName = "test";
        String lastName = "user";
        String email = "test@gmail.com";
        String phoneNumber = "123456";
        Admin instance = new Admin();
        int expResult = 1;
        int result = instance.registerUser(userName, password, firstName, lastName, email, phoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of addProduct method, of class Admin.
    */
    @Test
    public void testAddProduct() throws Exception {
        System.out.println("addProduct");
        String productName = "kurkure";
        String productMake = "nestle";
        double price = 10.0;
        int availability = 50;
        Admin instance = new Admin();
        int expResult = 1;
        int result = instance.addProduct(productName, productMake, price, availability);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }


    /**
     * Test of updateUserDetails method, of class Admin.
   
    @Test
    public void testUpdateUserDetails() throws Exception {
        System.out.println("updateUserDetails");
        String userName = "test123";
        String password = "12345";
        String firstName = "test123";
        String lastName = "user";
        String email = "tset@gmail.com";
        String phoneNumber = "12345";
        Admin instance = new Admin();
        int expResult = 1;
        int result = instance.updateUserDetails(userName, password, firstName, lastName, email, phoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of updateProductDetails method, of class Admin.
     
    @Test
    public void testUpdateProductDetails() throws Exception {
        System.out.println("updateProductDetails");
        int productId = 12;
        String productName = "kurkure";
        String productMake = "nestle";
        double price = 12.0;
        int availability = 50;
        Admin instance = new Admin();
        int expResult = 1;
        int result = instance.updateProductDetails(productId, productName, productMake, price, availability);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of deleteUserDetails method, of class Admin.
    */
    @Test
    public void testDeleteUserDetails() throws Exception {
        System.out.println("deleteUserDetails");
        String userName = "test123";
        Admin instance = new Admin();
        int expResult = 1;
        int result = instance.deleteUserDetails(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of deleteProduct method, of class Admin.
     
    @Test
    public void testDeleteProduct() throws Exception {
        System.out.println("deleteProduct");
        int productId = 12;
        Admin instance = new Admin();
        int expResult = 1;
        int result = instance.deleteProduct(productId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    */
}
