package JavaStart.hw6;

import java.util.Arrays;
import java.util.Scanner;

public class SequenceArrayCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        if(size>=0){
            sequence(size);
        }else exception();
    }

    public static void sequence (int size){
        int [] array = new int [size];
        for (int i = 0; i < size; i++) {
            array[i]=i;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void exception (){
        throw new IllegalArgumentException("Array size can't be less than 0");
    }
}
