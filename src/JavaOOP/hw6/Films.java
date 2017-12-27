package JavaOOP.hw6;

import java.util.ArrayList;
import java.util.List;

public class Films {
    private final List<Film> films = new ArrayList<>();

    public void add(Film film){
        films.add(film);
    }

    public void getFilms() {
        for (Film film : films) {
            System.out.println("film = " + film);
        }
    }
}
