package Tasks;

import java.util.Scanner;

public class Employee {

    public Scanner scanner = new Scanner(System.in);

    private String name;
    String surname;
    double salaryMonth; //BidDecimal - в больших фирмах - деньги
    int age;

    //konstruktor, metoda, ktora nazywa sie tak samo jak i klasa
    public Employee(String name, String surname, int age, double salary){
        setName(name);
        //this.name = name;
        setSurname(surname);
        this.salaryMonth = salary;
        this.age = age;
    }

    //dla kazdego pracownika inny wynik
    //gdy by tem sam wynik byl potrzebny jednakowy wynik

    double salaryYear(){
        return 12*this.salaryMonth;
    }

    String getFullName(){
        return name+" "+surname;
    }

    public void setName(String name){
        if (name.length()>=3 && Character.isUpperCase(name.charAt(0))) {
            this.name = name;
        } else {
            System.out.println("Niepoprawne imie");
        }

    }

    public String getName(){
        if (name == null){
            return "brak poprwanych danych";
        }
        return name;
    }

    public void setSurname(String surname){
        if(surname.length() >=3 &&Character.isUpperCase(surname.charAt(0))){
            this.surname = surname;
        } else {
            System.out.println("niepoprawne nazwizsko");
        }
    }

    public String getSurname(){
        if (name == null){
            return "brak poprwanych danych";
        }
        return surname;
    }


    public static void main(String[] args) {
        Employee first = new Employee("Michal","Archaniol", 500000, 10000);
        Employee second = new Employee("Pawel","Apostol", 50000, 1970);
        Employee third = new Employee("Piotr","Ex-Papierz", 5000, 92);

        System.out.println(first.salaryYear());
        System.out.println(second.salaryYear());
        System.out.println(third.salaryYear());

    }
}
