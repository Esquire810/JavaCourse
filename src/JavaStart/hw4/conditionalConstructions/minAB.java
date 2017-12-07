package JavaStart.hw4.conditionalConstructions;

import java.util.Scanner;

public class minAB
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        /*int min;
        if(a<b) {
            min = a;
        }else  min = b;*/
        int min = a < b ? a : b;
        System.out.println("min = " + min);
    }
}
