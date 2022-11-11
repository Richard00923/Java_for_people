package Lesson_1;

public class Main {

    public static void main(String[] args) {


        Posts post1 = new Posts(2,29,"Chelovek_pauk","I`m Dmitro");
        System.out.println(post1);
        post1.setId(2);
        post1.userId=2;
        System.out.println(post1);

        Comments comments=new Comments(0,28,"Kakos","kakos@gmail.com","a Yak Zhutu");

        System.out.println(comments);
        comments.setName("Lanos");
        System.out.println(comments);

    }

}
