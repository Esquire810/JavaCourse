package JavaStart.hw6;

import java.util.Scanner;

public class ArrayPositivesCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int narray = scanner.nextInt();
        int [] array = new int [narray];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < narray; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("count = " + count(array));
    }

    public static int count (int array[]){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>0){
                counter++;
            }
        }
        return counter;
    }
}
