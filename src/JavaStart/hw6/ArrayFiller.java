package JavaStart.hw6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFiller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int narray = scanner.nextInt();
        System.out.print("Enter the number to fill: ");
        int num = scanner.nextInt();
        filler(narray, num);
    }

    public static void filler(int narray, int num){
        int [] array = new int [narray];
        for (int i=0; i<narray; i++) {
            array[i] = num;
        }
        System.out.println(Arrays.toString(array));
    }
}
