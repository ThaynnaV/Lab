/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aadp_lab_soccersimulator;

import java.util.Scanner;

/**
 *
 * @author 2021267
 */
public class Menu {
    Scanner sc = new Scanner(System.in);
    private int option = 0;
    private boolean isValidOption = false;
    
    public Menu() {
    
    }
    
    //DISPLAY OPTIONS TO USERS
    public int DisplayMenuAndGetOption(){
        //first show options to the  user
        do {
            System.out.println("Welcome! What would you like to do today? Please enter the number corresponding to your choice.");
            System.out.println("1. Enter a new player to a team.");
            System.out.println("2. See the players on a team.");
            System.out.println("3. Simulate a number of matches.");
            System.out.println("4. Exit the programme.");            
        
//check the user input is betweej 1 and 4
            try {
                option = Integer.parseInt(sc.nextLine());
                if (option >= 1 && option <= 4) {
                    isValidOption = true;
                } else {
                    System.out.println("Please make sure to enter a number between 1 and 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
            
  
        } while (!isValidOption);//whie the options are correct
        return option;
    
    }    
}
