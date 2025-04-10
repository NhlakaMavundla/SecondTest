/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class POEpart1 {
    
    
    public static void main(String[] args) {
        Login loginObj = new Login();
        Scanner input = new Scanner(System.in);
        String username;
        String password = "";
        String phoneNumber;
        String verifyUsername;
        String verifyPassword;
        
        //Asks the user for the username
        System.out.println("Please enter the username");
        
        //The user enters the username
        username = input.nextLine();  
        
        //Decision statement for the username
        if(loginObj.checkUserName(username) == false){
            System.out.println("Username is not correctly formated, please ensure that your username contains an underscore(_) and is no more than five characters in length.");
        }else{
            
            System.out.println("Username successfully captured");
        }
        
        //Asking the user for the password
        System.out.println("Please enter the password");
        
        //user enters the password
        password = input.nextLine();
        
        //decisiom statement for the password
        if(loginObj.checkPasswordComplexity(password) == false){
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, and a special character.");
        }else{
            System.out.println("Password successfully captured");
        }
        
        //Asking the user for the phone number
        System.out.println("Please enter the phone number");
        
        //The user enters the numbers
        phoneNumber = input.nextLine();
        
        //Decision statement for the cellphone
        if(loginObj.checkPhoneNumber(phoneNumber) == false){
            System.out.println("Cell phone number incorrectly formatted or does not contain international code");
        }else{
            System.out.println("Cell phone number successfully added.");
        }
        
        //Message for registering
        System.out.println(loginObj.registerUser(username, password));
        
        //Welcoming the user
        System.out.println("****************************");
        System.out.println("Welcome can you please login");
        System.out.println("****************************");
        
        //Asking the user for the username that he entered before
        System.out.println("Please enter the username");
        
        //The user enters the username
        verifyUsername = input.nextLine();
        
        //Asking the user to enter the password
        System.out.println("Please enter the password");
        
        //User enters the password
        verifyPassword = input.nextLine();
        
        //The if statement that verify the username and the password
        if(loginObj.loginUser(username, verifyUsername, password, verifyPassword) == false){
            System.out.println("The password and the username is incorrect");
        }
        else{
            System.out.println("You are successfully logged in");
        }
    }
}
