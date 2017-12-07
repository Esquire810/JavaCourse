package JavaStart.hw4.Conditions;

import java.util.Scanner;

public class IsAgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        boolean isAge;
        if(0<age && age<121){
            isAge = true;
        } else {
            isAge = false;
        }
        System.out.println(isAge);
    }
}
