package JavaOOP.hw6;

public class Film {

    private final String name;
    private final int date;
    private final Actor actor;
    private final Genre genre;

    public Film(String name, int date, Actor actor, Genre genre) {
        this.name = name;
        this.date = date;
        this.actor = actor;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

    public Actor getActor() {
        return actor;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", actor=" + actor +
                ", genre=" + genre +
                '}';
    }
}
