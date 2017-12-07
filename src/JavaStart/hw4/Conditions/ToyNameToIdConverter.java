package JavaStart.hw4.Conditions;

import java.util.Scanner;

public class ToyNameToIdConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter toes: ");
        String toy = scanner.nextLine();

        switch (toy) {
            case "Car":
                System.out.println(0);
                break;
            case "Lego":
                System.out.println(1);
                break;
            case "Doll":
                System.out.println(2);
                break;
            case "Puzzle":
                System.out.println(3);
                break;
            default: throw new IllegalArgumentException("NO such toy");
        }
    }
}