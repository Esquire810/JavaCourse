package JavaStart.hw7.Level2;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicShifter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int length = scanner.nextInt();
        int [] array = new int[length];
        System.out.println("Enter  array element: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter shifter element: ");
        int shifter = scanner.nextInt();
        cyclicShifter(array, shifter);
    }

    public static void cyclicShifter (int []array, int shifter){
        for (int i = 0; i < array.length; i++) {
            array[i+1] = array[i];
            array[array.length] = array[0];
        }
        System.out.println(Arrays.toString(array));
    }
}
