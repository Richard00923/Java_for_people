package Lesson_2.Additional;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

     Posts post1 = new Posts(1,
                1,
                "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
                "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto");
        Posts post2 =new Posts( 1,
                2,
                 "qui est esse",
                 "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla");
        Posts post3 = new Posts( 1,
                 3,
                 "ea molestias quasi exercitationem repellat qui ipsa sit aut",
                 "et iusto sed quo iure\nvoluptatem occaecati omnis eligendi aut ad\nvoluptatem doloribus vel accusantium quis pariatur\nmolestiae porro eius odio et labore et velit aut");
        Comments comments1 = new Comments( 1,
                 1,
                "labore ex et quam laborum",
                 "Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"
);
        Comments comments2 = new Comments( 1,
                2,
                "quo vero reiciendis velit similique earum",
                 "Jayne_Kuhic@sydney.com",
                "est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et");
        Comments comments3 = new Comments( 1,
               3,
               "odio adipisci rerum aut animi",
                "Nikita@garfield.biz",
               "quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam est\ncum et ducimus et vero voluptates excepturi deleniti ratione"
);
        Comments comments4 = new Comments( 2,
                7,
                "repellat consequatur praesentium vel minus molestias voluptatum",
                 "Dallas@ole.me",
                "maiores sed dolores similique labore et inventore et\nquasi temporibus esse sunt id et\neos voluptatem aliquam\naliquid ratione corporis molestiae mollitia quia et magnam dolor"
);
        Comments comments5 = new Comments( 2,
                8,
                "et omnis dolorem",
                 "Mallory_Kunze@marie.org",
                "ut voluptatem corrupti velit\nad voluptatem maiores\net nisi velit vero accusamus maiores\nvoluptates quia aliquid ullam eaque"
);
        Comments comments6 = new Comments(3,
                13,
                "aut inventore non pariatur sit vitae voluptatem sapiente",
                 "Kariane@jadyn.tv",
                "fuga eos qui dolor rerum\ninventore corporis exercitationem\ncorporis cupiditate et deserunt recusandae est sed quis culpa\neum maiores corporis et"
);
        Comments comments7 = new Comments(
                3,
                14,
                "et officiis id praesentium hic aut ipsa dolorem repudiandae",
                 "Nathan@solon.io",
                "vel quae voluptas qui exercitationem\nvoluptatibus unde sed\nminima et qui ipsam aspernatur\nexpedita magnam laudantium et et quaerat ut qui dolorum"
);
        Comments comments8 = new Comments(3,
               15,
               "debitis magnam hic odit aut ullam nostrum tenetur",
                "Maynard.Hodkiewicz@roberta.com",
               "nihil ut voluptates blanditiis autem odio dicta rerum\nquisquam saepe et est\nsunt quasi nemo laudantium deserunt\nmolestias tempora quo quia"
);
        ArrayList<Posts> ListsPosts=new ArrayList<>();
        ListsPosts.add(post1);
        ListsPosts.add(post3);
        ListsPosts.add(post2);

        ArrayList<Comments> ListsComments=new ArrayList<>();
        ListsComments.add(comments1);
        ListsComments.add(comments2);
        ListsComments.add(comments3);
        ListsComments.add(comments4);
        ListsComments.add(comments5);
        ListsComments.add(comments6);
        ListsComments.add(comments7);
        ListsComments.add(comments8);

        for (Comments comment : ListsComments) {
            for (Posts post : ListsPosts) {
                if (post.getId()==comment.getPostId()){
                    post.addComent(comment.getId());
                }
            }
        }

        System.out.println(post1);

    }

}
