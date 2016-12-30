
package CompareBaza;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Baza {
   

    static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static String DB_URL = "jdbc:mysql://localhost/baza";
    static String USER="root";
    static String PASS="";
    
    public static ResultSet executeQuery(String query) {
        try {
            Class.forName(JDBC_DRIVER);
            try {
                Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
                PreparedStatement p = con.prepareStatement(query);
                return p.executeQuery();
            
            } catch (SQLException ex) {
                Logger.getLogger(Baza.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Błąd SQLa" + ex.getMessage());
            }
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(Baza.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Błąd JDBC" + ex.getMessage());
                    }
        return null;
    }
    
    public static int executeUpdate(String query){
        
         try {
            Class.forName(JDBC_DRIVER);
            try {
                Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
                        
                try(PreparedStatement p = con.prepareStatement(query)){
                    return p.executeUpdate();
                }
            
            } catch (SQLException ex) {
                Logger.getLogger(Baza.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Błąd SQLa" + ex.getMessage());
            }
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(Baza.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Błąd JDBC" + ex.getMessage());
                    }
        return -1;
    }
}

