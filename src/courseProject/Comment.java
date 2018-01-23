package courseProject;

public class Comment {
    private final String user;
    private final String text;

    public Comment(String user, String text) {
        this.user = user;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getUser() {
        return user;
    }
}
