package Tasks;

import java.time.LocalDate;

public class Inquiry {
    private String username;
    private String email;
    private LocalDate date;

    public Inquiry(String username, String email, LocalDate date) {
        this.username = username;
        this.email = email;
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    private boolean isOlderThanTwoWeeks() {
        return date.plusDays(14).isBefore(LocalDate.now());
    }


    public static void main(String[] args) {
        Inquiry inquiry = new Inquiry(
                "Michał",
                "michaldawaj@mail.com",
                LocalDate.of(2019, 7, 1));
        Inquiry inquiry2 = new Inquiry(
                "Michalina",
                "michaldawaj22@mail.com",
                LocalDate.of(2018, 10, 27));
        System.out.println(inquiry.isOlderThanTwoWeeks());
        System.out.println(inquiry2.isOlderThanTwoWeeks());

    }
}
