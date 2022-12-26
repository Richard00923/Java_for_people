package Lesson_2.Create_class_2;

import lombok.Getter;
import lombok.Setter;

public enum Gender {
MALE(true),FEMALE(false);
@Getter
@Setter
private  boolean pipka;
Gender(){

}
Gender(boolean pipka) { this.pipka = pipka;}
}
