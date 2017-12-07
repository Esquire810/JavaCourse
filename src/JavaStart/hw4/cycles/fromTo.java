package JavaStart.hw4.cycles;

import java.util.Scanner;

public class fromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter From: ");
        int from = scanner.nextInt();
        System.out.print("Enter To: ");
        int to = scanner.nextInt();

        if(from<=to){
            for(int i = from; i<=to; i++){
                System.out.println(i);
            }
        }else throw new IllegalArgumentException("From must be smaller then To");
    }
}
