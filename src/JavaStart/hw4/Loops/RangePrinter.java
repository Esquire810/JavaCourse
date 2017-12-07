package JavaStart.hw4.Loops;

import java.util.Scanner;

public class RangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int last = scanner.nextInt();

        if(first<last){
            int num = first;
            for(int i = 0; i<=(last-first); i++){
                System.out.println(num);
                num++;
            }
        } else {
            int num = first;
            for(int i = 0; i<=(first-last); i++){
                System.out.println(num);
                num--;
            }
        }
    }
}
