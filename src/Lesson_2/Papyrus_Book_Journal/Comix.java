package Lesson_2.Papyrus_Book_Journal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comix extends Book{
    private String comixCompany;

    public Comix(int age, String author, String title, String comixCompany) {
        super(age, author, title);
        this.comixCompany = comixCompany;
    }

    @Override
    public String toString() {
        return "Comix{" +
                "comixCompany='" + comixCompany + '\'' +
                "} " + super.toString();
    }
}
