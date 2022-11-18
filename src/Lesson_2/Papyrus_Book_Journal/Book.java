package Lesson_2.Papyrus_Book_Journal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book extends Papyrus{
    private String author;
    private String title;

    public Book(int age, String title) {
        super(age);
        this.title = title;
    }

    public Book(int age, String author, String title) {
        super(age);
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                "} " + super.toString();
    }
}
