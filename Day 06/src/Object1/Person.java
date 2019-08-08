package Object1;

import Tasks.Firm;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Person {
    /*        */
    public String name;
    public String surname;
    public String pesel;

    //psvm


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }
    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public Person(){};

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Adam";
        person1.surname = "Kowalski";
        person1.pesel = "41233532213";
        Person person2 = new Person(); //objekt klasy = pamięc
        person2.name = "Zofia";
        person2.surname = "Nowak";
        person2.pesel = "123456789";
    }
    @Override
    public String toString() {
        return " " +
                name + " " +
                surname + " " +
                pesel + " ";
    }
}

