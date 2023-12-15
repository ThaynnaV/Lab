/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aadp_lab_soccersimulator;
import java.util.Random;

/**
 *
 * @author Alany
 */
public class MatchSimulator {
  private String[] teams;

    public void simulateMatches(int numMatches) {
        Random random = new Random();

        for (int matchNum = 1; matchNum <= numMatches; matchNum++) {
            int team1Num = random.nextInt(teams.length);
            String team1 = teams[team1Num];

            int team2Num;
            do {
                team2Num = random.nextInt(teams.length);
            } while (team2Num == team1Num);
            String team2 = teams[team2Num];

            int team1Score = random.nextInt(7); // 0-6 goals
            int team2Score = random.nextInt(7); // 0-6 goals

            System.out.println("Match: " + matchNum);
            System.out.println(team1 + " " + team1Score + " - " + team2Score + " " + team2);
            System.out.println("---------------");
        }
    }
}
//The MatchSimulator class contains a method simulateMatches(int numMatches) that simulates the specified number of matches between randomly selected teams. It generates random scores for each match and displays them.

//Now, for the PlayerData class:


