
package com.mycompany.prota;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class bancodedados { 
     public static String URL = "jdbc:mysql://localhost:3306/rpg";
     public static String USER = "root";
     public static String PASSWORD = "senacrs";
     
     public static Connection getConnection() throws SQLException {
         return DriverManager. getConnection( URL, USER, PASSWORD);
     }
     public static void closeConnection (Connection connection) {
         if (connection != null ) {
             try { 
                 connection.close();
             }catch (SQLException e){
                 e.printStackTrace();
             }
             
         }
     }
}
