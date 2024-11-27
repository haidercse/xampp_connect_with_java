/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author uer
 */
public class Database {
    public static void main(String[] args) {

        // creates Connection object
          Connection conn1 = null;
       

        try {
            // connect way #1
            String url1 = "jdbc:mysql://localhost:3306/java_test";
            String user = "root";
            String password = "";

            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database");
                
                Statement stmt = conn1.createStatement();   //Creating Statement.
                //Executing Statement.
               // stmt.executeUpdate("create table `ScoreHistory`(`id` integer, `Player1` varchar(20), `Player2` varchar(20), `Score` integer)");
                stmt.executeUpdate("insert into `user` values(1, 'Black1', 'White@gmail.com')");
                stmt.executeUpdate("insert into `user` values(2, 'Black', 'White@gmail.com')");
                
            }

        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();

        }
        finally {
            if (conn1 != null) {
                try {
                    conn1.close();
                }
                catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
}
        
    }
  
}

