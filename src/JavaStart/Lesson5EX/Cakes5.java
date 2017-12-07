package JavaStart.Lesson5EX;

import java.util.Scanner;

public class Cakes5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter people: ");
        int people = scanner.nextInt();
        for (int i = 1; i<people+1; i++) {
            System.out.print("Enter cakes: ");
            int cakes = scanner.nextInt();
            System.out.println("I have " + cakes + " cakes.");
            for (int j = 1; j <= cakes; j++) {
                System.out.print("I`m " + i + " person. ");
                System.out.println("I have eaten " + j + " cake.");
            }
        }
    }
}
