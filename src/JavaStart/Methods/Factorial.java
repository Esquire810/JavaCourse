package JavaStart.Methods;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        System.out.println("Factorial = " + factor(num));
    }

    public static long factor (int num){
        long fact = 2;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
