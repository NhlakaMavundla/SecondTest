/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart1;

/**
 *
 * @author RC_Student_lab
 */
class Login {
    
    
    //Method to check the username
    public boolean checkUserName(String username){
        if(username.contains("_") && username.length() <= 5){
            return true;
        }else{
            
            return false;
        }
        
        
    }//Ending method
    
    //Method to check the password complexity
    public boolean checkPasswordComplexity(String password){
        if(password.length() > 8 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*")&& password.matches(".*[!@#$%^&*(),.?\":{}|<>].*") && password.matches((".*[0-9].*"))){
            return true;
        }else{
            System.out.println("Please make sure that the password has a capital letter, contains a number, is more than 8 letters long, and has a special character");
            return false;
        }
    }
    
    //Method for checking the cellphone number
    public boolean checkPhoneNumber(String phoneNumber){
        if(phoneNumber.contains("+27") && phoneNumber.length() == 12){
            return true;
        }else{
            return false;
        }
    }
    
    //Method for registering the user
    public String registerUser(String username, String password){
        String message;
        if(checkUserName(username) == false){
            message = "Username is not correctly formatted";
        }else if(checkPasswordComplexity(password) == false){
            message = "The password is not meet the complexity";
        }else{
            message = "The password and the username have been met have been met";
        }
        
        return message;
    }
    
    //Method to login the user
    public boolean loginUser(String username, String verifyUsername, String password, String verifyPassword){
            
        if(verifyUsername.equals(username) && verifyPassword.equals(password)){
            return true;
        }else{
            return false;
        }
    }
}
