package JavaOOP.hw6;

public class FilmRunner {
    public static void main(String[] args) {
        Film guardians = new Film("Guardians of the Galaxy", 2014, Actor.CHRISTOPHER_PRATT, Genre.FANTASY);
        Film furious = new Film("The Fate of the Furious", 2017, Actor.VIN_DIESEL, Genre.THRILLER);

        Films films = new Films();
        films.add(guardians);
        films.add(furious);

        films.getFilms();
        System.out.println();
        films.genreFilter(Genre.FANTASY);
        System.out.println();
        films.dataFilter(2011,2020);
        System.out.println();
        films.actorFilter(Actor.VIN_DIESEL);
    }
}
