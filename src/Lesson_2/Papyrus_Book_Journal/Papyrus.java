package Lesson_2.Papyrus_Book_Journal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Papyrus {
    private String cellulose;
    private String lignin;
    private String mineral_substances;
    private int  age;

    public Papyrus(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Papyrus{" +
                "cellulose='" + cellulose + '\'' +
                ", lignin='" + lignin + '\'' +
                ", mineral_substances='" + mineral_substances + '\'' +
                ", age=" + age +
                '}';
    }
}
