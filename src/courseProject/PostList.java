package courseProject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostList {

    private final List<Post> posts = new ArrayList<>();

    public void addPost(Post post){ posts.add(post);}

    public void getPosts() {
        for (Post post : posts) {
            System.out.println(post.toString());
            System.out.println();
        }
    }

    public void userFilter (String user){
        posts.stream()
                .filter(post -> post.getUser().equals(user))
                .forEach(post -> System.out.println(post.toString()));
    }

    public void dataFilter(Date date){
        posts.stream()
                .filter(post -> post.getPostDate().equals(date))
                .forEach(post -> System.out.println(post.toString()));
    }
}
