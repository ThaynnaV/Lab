/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aadp_lab_soccersimulator;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author lafla
 */
public class Database {
    
    public class DatabaseSetup {
    private String dbName;
    private String[] teams;
    private String DB_URL;
    private String USER;
    private String PASS;

    public DatabaseSetup(String dbName, String[] teams, String user, String pass) {
        this.dbName = dbName;
        this.teams = teams;
        this.DB_URL = "jdbc:mysql://localhost/" + dbName;
        this.USER = user;
        this.PASS = pass;
    }

    public void setupDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/", USER, PASS);
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE SCHEMA IF NOT EXISTS " + dbName + ";");
            stmt.execute("USE " + dbName + ";");
            for (String team : teams) {
                stmt.execute(
                        "CREATE TABLE IF NOT EXISTS " + team + " ("
                                + "name VARCHAR(30) NOT NULL,"
                                + "number INT NOT NULL PRIMARY KEY,"
                                + "birth VARCHAR(30),"
                                + "position VARCHAR(30),"
                                + "goalsScored INT,"
                                + "background TEXT(1000));"
                );
            }
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
             }
    }
}
}