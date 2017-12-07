package JavaStart.hw6;

import java.util.Random;
import java.util.Scanner;

public class MatrixAverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array i: ");
        int sizei = scanner.nextInt();
        System.out.print("Enter array j: ");
        int sizej = scanner.nextInt();
        System.out.println("Matrix average = " + matrixCalculator(sizei, sizej));
    }

    public static int matrixCalculator (int sizei, int sizej){
        Random random = new Random();
        int[][] array = new int[sizei][sizej];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < sizei; i++) {
            for (int j = 0; j < sizej; j++) {
                array[i][j] = random.nextInt(21);
            }
        }
        for (int i = 0; i < sizei; i++) {
            for (int j = 0; j < sizej; j++) {
                System.out.print(array[i][j]+ " ");
                sum+=array[i][j];
                count++;
            }
            System.out.println();
        }
        sum=sum/count;
        return sum;
    }
}
