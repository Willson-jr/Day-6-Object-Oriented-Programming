package Tasks;

import Object1.Person;

import java.util.ArrayList;
import java.util.List;

public class Firm {
    private String title;
    private String hq;
//    private int countOfEmployee;
    private List<Person> employee = new ArrayList<>();

    public Firm(String title, String hq, List<Person> people) {
        this.title = title;
        this.hq = hq;
//      this.countOfEmployee = countOfEmployee;
//        this.people = people;
    }

    public Integer getPeopleCount(){ return employee.size();
    }

    public void addEmployee(Person emplyee){
        employee.add(emplyee);
    }


    @Override
    public String toString() {
        return "Firm{" +
                "Firm title - " + title + ", " +
                "HQ - " + hq + ", " +
                "count of people - " + employee.size() +
                ", employees" + employee + "}";
    }
}

