package JavaStart.hw5;

import java.util.Scanner;

public class DigitsPrinter {

    public static void main(String[] args) {
        int num;
        int length;
        int numL;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = scanner.nextInt();
        length = String.valueOf(Math.abs(num)).length();
        numL = (int) Math.pow(10, length - 1);
        if (num < 0) {
            num *= -1;
            System.out.print("- ");
        }
        for (int i = 0; i < length; i++) {
            int ch = (num / numL) % 10;
            numL = numL / 10;
            System.out.print(ch + " ");
        }
    }
}