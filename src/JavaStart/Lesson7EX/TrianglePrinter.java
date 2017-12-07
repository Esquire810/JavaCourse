package JavaStart.Lesson7EX;

import java.util.Scanner;

public class TrianglePrinter {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter triangle: ");
//        int size = scanner.nextInt();
        printTreangle(-1);
        printTreangle(5);
    }

    public static void printTreangle(int size) {
        if(size<0){
            throw new IllegalArgumentException("Negative argument: " + size);
        }
        for (int i = 1; i <= size; i++) {
            LinePrinter.printLine(i);
        }

    }
}
