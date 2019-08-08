package Tasks;

import Object1.Person;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private String headquaters;

    private List<Person> employees = new ArrayList<>();

    public Company(String name, String headquaters) {
        this.name = name;
        this.headquaters = headquaters;
    }

    public void addEmployee(Person employee) {
        employees.add(employee);
    }
    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append(name);
        result.append(" Pracownicy: ");
        for (Person employee: employees ) {
            result.append(employee.name+" "+employee.surname+" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Company company = new Company("Facebook", "SanFrancisco");
        company.addEmployee(new Person("Mark", "Zeckerberg"));
        company.addEmployee(new Person("Marcin", "Pawloswski"));
        company.addEmployee(new Person("Mike", "Schopfer"));
        System.out.println(company);

    }
}
