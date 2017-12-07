package JavaStart.hw6;

import java.util.Scanner;

public class ArraySumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int narray = scanner.nextInt();
        int [] array = new int [narray];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < narray; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("sum = " + sum(array, narray));
    }

    public static int sum (int array[], int narray){
        int sum = 0;
        for (int i = 0; i < narray; i++) {
            sum += array[i];
        }
        return sum;
    }
}
