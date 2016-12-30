
package SingletonBaza;


public class Main {


    public static void main(String[] args) {
        Baza.executeUpdate("INSERT INTO phonebook (name, surname, nr, city, street) VALUES ('Andrzej', 'Jakistam', '666666666', 'Zadupie', 'Sezamkowa')");

        try (java.sql.ResultSet a = Baza.executeQuery("SELECT * from phonebook")) {
            while (a.next()) {
                System.out.println(a.getString(2));
            }
        } catch (java.sql.SQLException e) {
            System.out.println("Blad SQL: " + e.getMessage());
        }
        
    }
    
}
