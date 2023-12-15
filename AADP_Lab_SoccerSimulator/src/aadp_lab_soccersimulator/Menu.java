/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aadp_lab_soccersimulator;

import java.util.Scanner;

/**
 *
 * @author lafla
 */
public class Menu {
    Scanner sc = new Scanner(System.in);
    private int option = 0;
    private boolean isValidOption = false;
    
    public Menu() {
    
    }
    public void DisplayMenuAndGetOption(){
        //first show options to the  user
        do {
            System.out.println("Welcome! What would you like to do today? Please enter the number corresponding to your choice.");
            System.out.println("1. Enter a new player to a team.");
            System.out.println("2. See the players on a team.");
            System.out.println("3. Simulate a number of matches.");
            System.out.println("4. Exit the programme.");            
        
        
        } while (!isValidOption);//whie the options are correct
        
    }    
}
