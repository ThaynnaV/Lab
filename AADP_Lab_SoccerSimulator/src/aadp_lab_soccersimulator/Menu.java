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
    private String teamName;
    private boolean isValidTeam = false;


     public int displayMenuAndGetOption() {
        do {
            System.out.println("Welcome! What would you like to do today? Please enter the number corresponding to your choice.");
            System.out.println("1. Enter a new player to a team.");
            System.out.println("2. See the players on a team.");
            System.out.println("3. Simulate a number of matches.");
            System.out.println("4. Exit the programme.");

            try {
                option = Integer.parseInt(sc.nextLine());
                if (option < 1 || option > 4) {
                    System.out.println("That is an invalid number. Please try again!");
                    option = 0; // Resetting option to trigger re-prompting
                }
            } catch (NumberFormatException e) {
                System.out.println("That is not a number. Please try again!");
            }
        } while (option < 1 || option > 4);

        return option;
    }


    public int getPositiveIntegerInput(String message) {
        int number = 0;
        boolean validInput = false;

        do {
            try {
                System.out.println(message);
                number = Integer.parseInt(sc.nextLine());
                if (number < 1) {
                    System.out.println("Please enter a positive integer.");
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("That is not a number. Please try again!");
            }
        } while (!validInput);

        return number;
    }

    public void addPlayerToTeam(PlayerData playerData) {
    }

    public void displayPlayersOfTeam(PlayerData playerData) {}

    public void simulateMatches(MatchSimulator matchSimulator) {
        int numMatches = getPositiveIntegerInput("How many matches would you like to simulate?");
        matchSimulator.simulateMatches(numMatches);
    }
}

