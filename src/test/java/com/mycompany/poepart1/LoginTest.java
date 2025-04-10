/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poepart1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
    
    public LoginTest() {
    }


    /**
     * Test of checkUserName method, of class Login.
     */
    @org.junit.jupiter.api.Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "kyl_1";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @org.junit.jupiter.api.Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "Ch&&se@ke99!";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkPhoneNumber method, of class Login.
     */
    @org.junit.jupiter.api.Test
    public void testCheckPhoneNumber() {
        System.out.println("checkPhoneNumber");
        String phoneNumber = "+27838968976";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkPhoneNumber(phoneNumber);
        assertEquals(expResult, result);
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @org.junit.jupiter.api.Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "kyl_1";
        String password = "Ch&&se@ke99!";
        Login instance = new Login();
        String expResult = "The password and the username have been met have been met";
        String result = instance.registerUser(username, password);
        assertEquals(expResult, result);
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @org.junit.jupiter.api.Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "kyl_1";
        String verifyUsername = "kyle111111";
        String password = "Ch&&se@ke99!";
        String verifyPassword = "password";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginUser(username, verifyUsername, password, verifyPassword);
        assertEquals(expResult, result);
    }
    
}
