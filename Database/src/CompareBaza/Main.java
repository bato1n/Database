
package CompareBaza;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        long[] chair1 = new long[40000];
        Random r = new Random();
        String q = "INSERT INTO chair (DATA) values ";
        for (int i=0; i<chair1.length; i++) {
            if (i != 0) q += ", ";
            chair1[i] = r.nextLong();
            q += "(" + chair1[i] + ")";
        }
        Baza.executeUpdate(q);
        
        long czas = System.currentTimeMillis();
        java.util.Arrays.sort(chair1);
        czas = System.currentTimeMillis() - czas;
        System.out.println("Java: " + czas + "ms");
        
        czas = System.currentTimeMillis();
        Baza.executeQuery("SELECT * FROM chair ORDER BY data ASC");
        czas = System.currentTimeMillis() - czas;
        System.out.println("SQL: " + czas + "ms");
        
        Baza.executeUpdate("DELETE FROM chair");
    }
    
}
