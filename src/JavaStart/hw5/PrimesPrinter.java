package JavaStart.hw5;

import java.util.Scanner;

public class PrimesPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter From: ");
        int from = scanner.nextInt();
        System.out.print("Enter To: ");
        int to = scanner.nextInt();
        int dividers;
        if (from < to ) {
            for (int i = from; i <= to; i++)
            {
                if(i<2){

                }else {
                    dividers = 0;
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0)
                            dividers++;
                    }
                    if (dividers <= 2)
                        System.out.println(i);
                }
            }
        } else if(from>to && from>0 && to>0) Exception();
    }

    static void Exception(){
        throw new IllegalArgumentException("From must be smaller then To");
    }
}
