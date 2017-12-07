package JavaStart.hw6;

import java.util.Scanner;

public class ArrayPositiveFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int narray = scanner.nextInt();
        int [] array = new int [narray];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < narray; i++) {
            array[i] = scanner.nextInt();
        }
        find(array);
    }

    public static void find (int array[]){
        int firstNum = -1;
        int lastNum = -1;
        for (int i = 0; i <array.length; i++) {
            if(array[i]>0){
                if(firstNum==-1){
                    firstNum=array[i];
                }
                lastNum=array[i];
            }
        }

        if(firstNum==-1 && lastNum ==-1){
            System.out.println(-1);
        }else {
            System.out.println("First positive element: " + firstNum);
            System.out.println("Last positive element: " + lastNum);
        }
    }
}
