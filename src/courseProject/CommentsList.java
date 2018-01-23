package courseProject;

import java.util.ArrayList;
import java.util.List;

public class CommentsList {
    private final List<Comment> comments = new ArrayList<>();

    public void addComment(Comment comment){
        comments.add(comment);
    }

    public void getComments() {
        for (Comment comment: comments) {
            System.out.println(comment);
        }
    }
}
