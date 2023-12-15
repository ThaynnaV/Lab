/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aadp_lab_soccersimulator;
import java.sql.*;
/**
 *
 * @author alany
 */
public class PlayerData {
    
    private String DB_URL;
    private String USER;
    private String PASS;

    public PlayerData(String dbURL, String user, String pass) {
        this.DB_URL = dbURL;
        this.USER = user;
        this.PASS = pass;
    }

    public void addPlayer(String teamName, String name, int number, String birth, String position, int goalsScored, String background) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            stmt.execute(
                    String.format("INSERT INTO %s (name, number, birth, position, goalsScored, background) "
                                    + "VALUES (\"%s\", %d, \"%s\", \"%s\", %d, \"%s\");",
                            teamName, name, number, birth, position, goalsScored, background)
            );
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void displayPlayers(String teamName) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * from " + teamName + ";");

            while (rs.next()) {
                String name = rs.getString("name");
                int number = rs.getInt("number");
                String birth = rs.getString("birth");
                String position = rs.getString("position");
                int goalsScored = rs.getInt("goalsScored");
                String background = rs.getString("background");

                System.out.println("Name: " + name + " | Number: " + number + " | Birth: " + birth +
                        " | Position: " + position + " | Goals Scored: " + goalsScored +
                        "\nBackground:\n" + background);
                System.out.println("---------------");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
}
}
