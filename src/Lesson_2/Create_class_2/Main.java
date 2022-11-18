package Lesson_2.Create_class_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Skill> skills1 = new ArrayList<>();
        skills1.add(new Skill("java","10 years"));
        skills1.add(new Skill("js","10 years"));
        skills1.add(new Skill("c++","10 years"));
        User user = new User(1, "vasya", "ppkin", "sdadadass@gmail.com", 31, Gender.FEMALE,skills1,new Car("Toyota",1092,400)
                );
        System.out.println(user);
    }
}
