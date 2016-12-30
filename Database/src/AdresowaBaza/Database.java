
package AdresowaBaza;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static String DB_URL = "jdbc:mysql://localhost/baza";
    static String USER="root";
    static String PASS="";
    
    public static void load() {
        try {
            Class.forName(JDBC_DRIVER);
            try {
                Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
                String query = "SELECT * from phonebook";
                try(PreparedStatement p = con.prepareStatement(query)){
                    try(ResultSet result = p.executeQuery()) {
                        while(result.next()) {
                            System.out.println(result.getString(2));
                        }
                    }
                }
            
            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Błąd SQLa" + ex.getMessage());
            }
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Błąd JDBC" + ex.getMessage());
                    }
    }
    
    public static void add(Person person){
        
         try {
            Class.forName(JDBC_DRIVER);
            try {
                Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
                String query = "INSERT INTO phonebook (name, surname, nr, city, street) VALUES ('"
                        + person.name + "', '"
                        + person.surname + "', '"
                        + person.nr + "', '"
                        + person.city + "', '"
                        + person.street + "')";
                try(PreparedStatement p = con.prepareStatement(query)){
                    int res = p.executeUpdate();
                }
            
            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Błąd SQLa" + ex.getMessage());
            }
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Błąd JDBC" + ex.getMessage());
                    }
        
    }
}
