package Lesson_2.hierarchy;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(new Pc("ryzen 3600x","GForse 1060","16 gb"),"15,6");
        System.out.println(laptop);
    }
}
