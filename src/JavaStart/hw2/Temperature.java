package JavaStart.hw2;

import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Celsius ");
        double celsius = scanner.nextInt();
        double farengeit = celsius * 1.8 + 32;
        System.out.println(celsius + " °C-> " + farengeit + " °F");
    }
}
