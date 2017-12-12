package JavaOOP.hw3.cinema;


public class Movie {

    private final String movieName;
    private final int movieDate;
    private final int movieTime;
    private final String description;

    public Movie(String movieName, int movieDate, int movieTime, String description) {
        this.movieName = movieName;
        this.movieDate = movieDate;
        this.movieTime = movieTime;
        this.description = description;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getMovieDate() {
        return movieDate;
    }

    public int getMovieTime() {
        return movieTime;
    }

    public String getDescription() {
        return description;
    }

    public void printMovieInfo(){
        System.out.println(getMovieName() + " released in " + getMovieDate() + " film lasting " + getMovieTime() + " minute. " + getDescription());
    }
}
