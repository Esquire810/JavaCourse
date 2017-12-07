package JavaStart.hw6;

import java.util.Scanner;

public class MatrixPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array i: ");
        int sizei = scanner.nextInt();
        System.out.print("Enter array j: ");
        int sizej = scanner.nextInt();
        matrix(sizei, sizej);
    }

    public static void matrix(int sizei, int sizej) {
        char[][] array = new char[sizei][sizej];
        char ch = '\u058D';
        for (int i = 0; i < sizei; i++) {
            for (int j = 0; j < sizej; j++) {
                array[i][j] = ch;
            }
        }
        for (int i = 0; i < sizei; i++) {
            for (int j = 0; j < sizej; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
