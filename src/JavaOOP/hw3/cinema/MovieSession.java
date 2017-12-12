package JavaOOP.hw3.cinema;


public class MovieSession {

    private Movie movie;
    private HallForSession hall;
    private int ticketPrice;
    private String startTime;

    public MovieSession(Movie movie, HallForSession hall, int ticketPrice, String startTime) {
        this.movie = movie;
        this.hall = hall;
        this.ticketPrice = ticketPrice;
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "MovieSession{" +
                "movie=" + movie +
                ", hall=" + hall +
                ", ticketPrice=" + ticketPrice +
                ", startTime='" + startTime + '\'' +
                '}';
    }

    public void finalfee (){
        System.out.println("Final fee: " + hall.countBuyPlace()*ticketPrice);
    }
}
