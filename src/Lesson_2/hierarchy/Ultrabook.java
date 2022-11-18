package Lesson_2.hierarchy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ultrabook {
    private Laptop laptop;
    private double weight;
}
