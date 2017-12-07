package JavaStart.hw2;
import java.util.Scanner;
public class DigitsPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение ");
        int n = scanner.nextInt();
        System.out.print("Сколько вывести значений: ");
        int k = (int) Math.pow(10,scanner.nextInt());

        for(int i = 0; i<k; i++) {
            int ch = (n / k) % 10;
            k = k / 10;
            System.out.println(ch);
        }
    }
}
