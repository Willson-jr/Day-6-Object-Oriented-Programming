package Tasks;

import java.util.ArrayList;
import java.util.List;

public class User {
    String id;
    String name;
    String surname;
    String salary;
    String age;
    String email;
    String password;
    Boolean admin;

    public static void main(String[] args) {
        User first = new User();
        first.id = "Piotr";
        first.email = "piotr@sw.va";
        first.password = "brama";
        first.admin = true;

        User second = new User();
        second.id = "Pawel";
        second.email = "pawel@sw.va";
        second.password = "sec0nd";
        second.admin = false;

        User third = new User();
        third.id = "Szymon";
        third.email = "szymon@sw.va";
        third.password = "krzyz";
        third.admin = true;

        List<User> user = new ArrayList<>();
        user.add(first);
        user.add(second);
        user.add(third);
        for (User users : user) {
            System.out.println("Nazwa uzytkownika: "+users.id);
            System.out.println("Email: "+ users.email);
            System.out.println("Haslo: "+users.password);
            if (users.admin) {
                System.out.println("Admin");
            } else {
                System.out.println("Nie admin");
            }
            System.out.println();
        }
    }

}
