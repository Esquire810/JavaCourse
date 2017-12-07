package JavaStart.Methods;

import java.util.Scanner;

public class PrintEvents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter from: ");
        int from = scanner.nextInt();
        System.out.print("Enter to: ");
        int to = scanner.nextInt();
        print(from, to);
    }

    public static void print (int from, int to){
        for (int i = from; i <= to; i++) {
            if (i%2==0){
                System.out.print(i + " ");
            }
        }
    }
}
