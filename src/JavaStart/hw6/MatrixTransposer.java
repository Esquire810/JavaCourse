package JavaStart.hw6;

import java.util.Random;
import java.util.Scanner;

public class MatrixTransposer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array i: ");
        int sizei = scanner.nextInt();
        System.out.print("Enter array j: ");
        int sizej = scanner.nextInt();
        Random random = new Random();
        int[][] array = new int[sizei][sizej];
        //firsr
        for (int i = 0; i < sizei; i++) {
            for (int j = 0; j < sizej; j++) {
                array[i][j] = random.nextInt(21);
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        transporer(array);
        System.out.println();
        for (int j = 0; j < sizej; j++) {
            for (int i = 0; i < sizei; i++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }

    }

    public static int[][] transporer (int array[][]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        return array;
    }
}
