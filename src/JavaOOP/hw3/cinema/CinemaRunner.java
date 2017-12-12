package JavaOOP.hw3.cinema;

import java.util.Scanner;

public class CinemaRunner {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Movie movie = new Movie("The Foreigner", 2017, 113, "В центре событий киноленты лежит история скромного лондонского бизнесмена китайского происхождения," + "\n" +
                "который является ветераном войны во Вьетнаме. В далёком прошлом, по окончании боевых действий, он был осужден и отправлен в тюрьму."+ "\n" +
                "Отсидев срок и выйдя на свободу, мужчина забирает семью и бежит в Гонконг. Но там его семья становится жертвой тайских пиратов, и несчастный отец теряет двух старших дочерей.");
        movie.printMovieInfo();
        HallForSession hallForSession = new HallForSession(4, 4);
        String again;
        hallForSession.printArray();
        do {
            System.out.println("What place do you want buy (row, place): ");
            int row = scanner.nextInt();
            int place = scanner.nextInt();
            hallForSession.setHall(row, place);
            hallForSession.printArray();
            System.out.println("Do you want buy ticket?");
            again = scanner.next();
        } while (again.equals("Yes"));
        System.out.println("Free place: " + hallForSession.countFreePlace());
        System.out.println("Buy place: " + hallForSession.countBuyPlace());
        hallForSession.printArray();
    }
}
