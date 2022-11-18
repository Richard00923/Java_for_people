package Lesson_2.Creata_class;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
   private String name;
   private String username;
   private String email;
   private String website;
   private String phone;
   private int id ;
   private Company company;
   private Address address;

}
