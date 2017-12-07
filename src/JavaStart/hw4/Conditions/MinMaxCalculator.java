package JavaStart.hw4.Conditions;

import java.util.Scanner;

public class MinMaxCalculator {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        if(a>b){
            System.out.println("max = " + a);
            System.out.println("min = " + b);
        } else {
            System.out.println("max = " + b);
            System.out.println("min = " + a);
        }
    }
}
