package courseProject;


public class Post {
    private final String user;
    private final String text;
    PostDate postDate = new PostDate();

    public Post(String user,String text) {
        this.user = user;
        this.text = text;
    }

    public String getUser() {
        return user;
    }

    public String getText() {
        return text;
    }

    public PostDate getPostDate() {
        return postDate;
    }

    @Override
    public String toString() {
        return user + "    " + postDate.toString() + "\n" + text;
    }
}
