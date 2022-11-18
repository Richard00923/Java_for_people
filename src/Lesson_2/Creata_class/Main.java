package Lesson_2.Creata_class;

public class Main {
    public static void main(String[] args) {
        User user = new User("Leanne Graham",
                "Bret",
                "Sincere@april.biz",
                "1-770-736-8031 x56442",
                "hildegard.org",
                1,
                new Company("Romaguera-Crona",
                        "Multi-layered client-server neural-net",
                        "harness real-time e-markets"),
                new Address("Kulas Light",
                        "Apt. 556",
                        "Gwenborough",
                        "92998-3874",new Geo(-37.3159,81.1496)
                ));
        System.out.println(user);
    }
}
