package JavaStart.hw5;

import java.security.spec.ECField;
import java.util.Scanner;

public class RadixPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String again = null;
        do {
            System.out.print("Enter number: ");
            String n = scanner.nextLine();
            int num = Integer.parseInt(n);
            System.out.print("Enter notation: ");
            String notation = scanner.nextLine();
            int notat = Integer.parseInt(notation);
            if(num<0 || notat<0) {
                Exception();
            }else {
                System.out.println(Integer.toString(num, notat));
                System.out.println("Do you want translate again?");
                again = scanner.nextLine();
            }
        }while (again.equals("Yes"));
    }
    static void Exception(){
        throw new IllegalArgumentException("Number or Notation must be >0");
    }
}
