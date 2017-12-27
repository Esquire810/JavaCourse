package JavaOOP.hw6;

public class FilmRunner {
    public static void main(String[] args) {
        Film guardians = new Film("Guardians of the Galaxy", 2014, Actor.CHRISTOPHER_PRATT, Genre.FANTASY);
        Film furious = new Film("The Fate of the Furious", 2017, Actor.VIN_DIESEL, Genre.THRILLER);

        Films films = new Films();
        films.add(guardians);
        films.add(furious);

        films.getFilms();
    }
}
