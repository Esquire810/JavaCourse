package JavaStart.Lesson5EX;

import java.util.Scanner;

public class Cakes2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cakes: ");
        int cakes = scanner.nextInt();
        System.out.println();
        System.out.println("I have " + cakes + " cakes.");
        for(int i = cakes-1; i>=0; i--){
            System.out.println("I have eaten a cake. " + i + " are left.");
        }
    }
}
