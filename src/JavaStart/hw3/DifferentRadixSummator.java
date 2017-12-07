package JavaStart.hw3;
import java.util.Scanner;
public class DifferentRadixSummator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения чтобы найти сумму");
        System.out.print("Введите бинарное число: ");
        int x = scanner.nextInt(2);
        System.out.print("Введите число 8-ой системы: ");
        int y = scanner.nextInt(8);
        System.out.print("Введите число 16-ой системы: ");
        int z = scanner.nextInt(16);
        int sum = x+y+z;
        System.out.println("Сумма чисел = " +sum);
    }
}
