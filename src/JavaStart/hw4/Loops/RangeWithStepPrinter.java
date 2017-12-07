package JavaStart.hw4.Loops;

import java.util.Scanner;

public class RangeWithStepPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int last = scanner.nextInt();
        System.out.print("Enter step: ");
        int step = scanner.nextInt();

        if(step>=first && step<last){
            int num = first;
            for (int i=0; i<=(last-first)/step; i++){
                System.out.println(num);
                num += step;
            }
        } else if(first>last && step<=first){
            int num = first;
            for (int i=0; i<=(first-last)/-step; i++){
                System.out.println(num);
                num += step;
            }
        } else if(step<first){
            throw new IllegalArgumentException("Incorrectly entered step");
        }
    }
}
