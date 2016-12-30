package AdresowaBaza;

import java.util.*;

public class Person implements Comparable<Person> {
     
    public String name;
    public String surname;
    public int nr;
    public String city;
    public String street;
    
        public Person(String name, String surname, int nr, String city, String street) {
        this.name = name;
        this.surname = surname;
        this.nr = nr;
        this.city = city;
        this.street = street;
    }
    @Override
        public String toString() {
        return surname + " " + name + " " + nr + " " + city + " " + street;
    }
        
        public int compareTo(Person o) {
        int porownaneNazwiska = surname.compareTo(o.surname);
 
        if(porownaneNazwiska == 0) {
            return name.compareTo(o.name);
        }
        else {
            return porownaneNazwiska;
        }
        }
}