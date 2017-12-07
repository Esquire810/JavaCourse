package JavaStart.hw4.conditionalConstructions;

import java.util.Scanner;

public class NNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n  = scanner.nextInt();

        if (100<=n && n<=200){
            System.out.println(true);
        }else System.out.println(false);
    }
}
