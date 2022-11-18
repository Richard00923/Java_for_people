package Lesson_2.Papyrus_Book_Journal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Journal extends Book{
    private String publishing_house;

    public Journal(int age, String title, String publishing_house) {
        super(age, title);
        this.publishing_house = publishing_house;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "publishing_house='" + publishing_house + '\'' +
                "} " + super.toString();
    }
}
