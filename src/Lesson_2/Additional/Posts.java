package Lesson_2.Additional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Posts {
    private int userId;
    private int id;
    private String title;

    private String body;
    private  ArrayList<Integer> coments=new ArrayList<>();

    public void addComent(int value) {
        coments.add(value);
    }

    public Posts(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }
}

