package courseProject;

import java.time.LocalDate;
import java.time.LocalTime;

public class PostDate {
    private final LocalDate date;
    private final LocalTime time;

    public PostDate() {
        this.date = LocalDate.now();
        this.time = LocalTime.now();
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return date + ", " + time;
    }

}
