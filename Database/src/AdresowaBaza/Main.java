package AdresowaBaza;

import java.util.*;

public class Main {


    public static void main(String[] args) {
/*
        List<Person> ludzie = new ArrayList<Person>();
        ludzie.add(new Person("Asia", "Wczorajsza", 123456789, "Kraków", "3-maja"));
        ludzie.add(new Person("Marcin", "Nikczemny", 234567891, "Warszawa", "4-maja"));
        ludzie.add(new Person("Slawek", "Abacki", 345678912, "Wroclaw", "5-maja"));
        ludzie.add(new Person("Kasia", "Borowik", 456789123, "Katowice", "6-maja"));
        ludzie.add(new Person("Dorota", "Borowik", 567891234, "Poznan", "7-maja"));
        ludzie.add(new Person("Tomek", "Daszek", 678912345, "Lublin", "8-maja"));
        ludzie.add(new Person("Ania", "Daszek", 789123456, "Czestochowa", "9-maja"));
        
        ludzie.sort(null);
        
            for(Person person : ludzie) {
            System.out.println(person);
            }*/

        Database.load();
        Database.add(new Person("Marcin", "Nikczemny", 234567891, "Warszawa", "4-maja"));
    }
    
}
