package JavaStart.Lesson5EX;

import java.util.Scanner;

public class Cakes3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cakes: ");
        int cakes = scanner.nextInt();
        System.out.println();
        System.out.println("I have " + cakes + " cakes.");
        for(int i = 1; i<=cakes; i++){
            System.out.println("I have eaten " + i + " cake.");
            if(i%2==0){
                System.out.println("Wonderful world.");
            }
        }
    }
}
