package JavaStart.hw6;

import java.util.Random;
import java.util.Scanner;

public class ERRORMatrixMaxSumRowFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        Random random = new Random();
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = random.nextInt(11);
            }
        }
        System.out.println(rowFinder(array, size));
    }

    public static int rowFinder (int[][] array, int size){
        int maxcount = -1;
        int nn = -1;
        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int a = 0; a < size; a++) {
                System.out.print(array[i][a]+ " ");
                count += array[i][a];
                }
            if (maxcount == -1) {
                maxcount = count;
                nn = i;
            } else {
                if (maxcount < count) {
                    maxcount = count;
                    nn = i;
                }
            }
            System.out.println();
        }
        return nn;
    }
}
