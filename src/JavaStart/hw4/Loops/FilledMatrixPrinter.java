package JavaStart.hw4.Loops;

import java.util.Scanner;

public class FilledMatrixPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int rows = scanner.nextInt();
        System.out.print("Enter second number: ");
        int cols = scanner.nextInt();
        System.out.print("Enter step: ");
        int filler = scanner.nextInt();
        int array [][] = new int [rows][cols];

        if(rows>0 && cols>0){
            for (int i=0; i<rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = filler;
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }
        } else if(rows<0 || cols<0){
            throw new IllegalArgumentException("Value is not correct");
        }
    }
}
