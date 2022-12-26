package Lesson_4.Test_1;

import Lesson_2.Create_class_2.Car;
import Lesson_2.Create_class_2.Gender;
import Lesson_4.Task_1.ItUser;
import Lesson_4.Task_1.Skill;
import Lesson_4.Task_1.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Vasya","kovalchuk",22));
        users.add(new User("Ivan","Petrov",19 ));
        users.add(new User("Petro","Kokosik",23));
        users.sort((u1,u2)-> u1.getAge()- u2.getAge());
        System.out.println(users);

        ArrayList<String> strings =new ArrayList<>();
        strings.sort(((o1, o2) -> o1.compareTo(o2)));

        HashSet<ItUser> userHesh = new HashSet<>();
        userHesh.add(new ItUser(0,"igor","palik","IgorPalik23@gmail.com",24,Gender.MALE
                ,new Car("mazda",2000,25)));


        System.out.println(userHesh);


    }
}
