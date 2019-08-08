package Object1;

import Tasks.Firm;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //new - konstruktor classy
        Person adam = new Person(); //objekt klasy = pamięc
        adam.name = "Adam";
        adam.surname = "Kowalski";
        adam.pesel = "41233532213";

        Person zosia = new Person(); //objekt klasy = pamięc
        zosia.name = "Zofia";
        zosia.surname = "Nowak";
        zosia.pesel = "123456789";
//        System.out.println(zosia.pesel); //null
        // jesli dane pole nie jest zainicjalizowane
        // to zmienna przyjmuje default wartosc

        /*
        Typ Klassy - null
        int - 0;
        boolean - false;
        double - 0.0;
        char - '\u0000';
         */

        List<Person> people = new ArrayList<>();
        people.add(adam);
        people.add(zosia);
//        for (Person p: people  ) {
//            System.out.println(p.name+" "+p.surname);
//
//        }

        Firm firma = new Firm(
                "Dupa LLC",
                "Warszawa",
                people);


        System.out.println(firma);
    }
}
