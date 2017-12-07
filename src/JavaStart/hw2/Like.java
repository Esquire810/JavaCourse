package JavaStart.hw2;

import java.util.Scanner;
public class Like {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество лайков ");
        long likeCount = scanner.nextInt();
        System.out.print("Введите год регистрации ");
        int registrYear = scanner.nextInt();
        int nowYear =  java.time.Year.now().getValue();

        double likeYear = (double) likeCount / (nowYear - registrYear + 1);
        System.out.print(likeYear + " likes/year");
    }
}
