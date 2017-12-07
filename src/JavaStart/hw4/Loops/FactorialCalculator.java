package JavaStart.hw4.Loops;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();

        if (0<n && n<21){
            long factor = 1;
            for (int i= 1; i<=n; i++){
                factor *= i;
            }
            System.out.println("Factorial = " + factor);
        } else {
            throw new IllegalArgumentException("argument must be in the range [1..20], but actually is " + n);
        }
    }
}
