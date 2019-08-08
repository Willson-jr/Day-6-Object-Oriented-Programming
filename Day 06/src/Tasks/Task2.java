package Tasks;

public class Task2 {

    public static void main(String[] args) {
        Employee first = new Employee("jan","pi", 500000, 10000);

        System.out.println(first.getName());
        System.out.println(first.salaryYear());
        System.out.println(first.getSurname());
        Employee second = new Employee("Pawel","Apostol", 50000, 1970);
        Employee third = new Employee("Piotr","Ex-Papierz", 5000, 92);
    }



}
