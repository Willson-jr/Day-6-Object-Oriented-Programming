package Task6;

public class Main {
    public static void main(String[] args) {
        Category AGD = new Category(
                1,
                "AGD");
        Category cyfr = new Category(
                2,
                "cyfr");


        Product first = new Product(
                1,
                "Super pralka",
                AGD);
        Product second = new Product(
                2,
                "Suszarka",
                AGD);
        Product third = new Product(
                2,
                "Super computer",
                cyfr
                );




        System.out.println(first);


    }
}
