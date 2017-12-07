package JavaStart.hw4.Loops;

import java.util.Scanner;

public class EvensRangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter last number: ");
        int last = scanner.nextInt();

        if(first<last){
            int num = first;
            for(int i=0; i<=last-first; i++){
                if(num % 2 == 0) {
                    System.out.println(num);
                }
                num++;
            }
        } else {}
    }
}
