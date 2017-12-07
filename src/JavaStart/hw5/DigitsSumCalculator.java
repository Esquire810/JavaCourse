package JavaStart.hw5;

import java.util.Scanner;

public class DigitsSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter From: ");
        int from = scanner.nextInt();
        System.out.print("Enter To: ");
        int to = scanner.nextInt();
        int sum = 0;
        if(from == to){
            int length = String.valueOf(Math.abs(from)).length();
            int numL = (int) Math.pow(10, length - 1);
            for (int i = 0; i < length; i++) {
                int ch = (from / numL) % 10;
                numL = numL / 10;
                sum +=ch;
            }
        }else{
            if (from < 0) {
                from *= -1;
            }
            for (int i = from; i >=to; i--) {
                sum += i;
            }
        }
        System.out.println("digitsSum (" + from + ", " + to + ") == " +sum);
    }
}
