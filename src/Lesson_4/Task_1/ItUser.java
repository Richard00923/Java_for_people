package Lesson_4.Task_1;

import Lesson_2.Create_class_2.Car;
import Lesson_2.Create_class_2.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ItUser {
    private int id ;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
//    private  List<Skill> skills = new ArrayList<>();
    private Car car;

}
