package JavaStart.hw4.conditionalConstructions;

import java.util.Scanner;

public class minABC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();
        /*int min;
        if(a<b && a<c){
            min = a;
        }else
            if(b<a && b<c) {
                min = b;
            } else min = c;*/
        int min = (a<b) ? a : b;
        min = (min<c) ? min : c;
        System.out.println("min = " + min);
    }
}
