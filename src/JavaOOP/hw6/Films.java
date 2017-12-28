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

    public void genreFilter(Genre genre){
        films.stream()
                .filter(film->film.getGenre().equals(genre))
                .forEach(film-> System.out.println(film.toString()));
    }

    public void dataFilter(int firstDate, int lastDate){
        films.stream()
                .filter(film -> firstDate<film.getDate())
                .filter(film -> film.getDate()<lastDate)
                .forEach(film -> System.out.println(film.toString()));
    }

    public void actorFilter(Actor actor){
        films.stream()
                .filter(film->film.getActor().equals(actor))
                .forEach(film-> System.out.println(film.toString()));
    }
}
