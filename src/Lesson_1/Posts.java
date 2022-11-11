package Lesson_1;

public class Posts {

    int userId ;
   private int id;
    String title;
    String body;

    public Posts(){

    }
    public  Posts(int userId,int id,String title,String body){
        this.userId=userId;
        this.id =id;
        this.title=title;
        this.body= body;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
