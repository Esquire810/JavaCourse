package JavaStart.hw2;
import java.util.Scanner;
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение a ");
        int a = scanner.nextInt();
        System.out.print("Введите значение b ");
        int b = scanner.nextInt();

        int middle = (a/2+b/2  + (a%2 + b%2)/2);
        System.out.println("Среднее арефметическое двух чисел = " + middle);
    }
}
