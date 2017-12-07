package JavaStart.hw4.Conditions;

import java.util.Scanner;

public class AgeParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        String age = scanner.nextLine();
        int  parseAge = Integer.parseInt(age);
        if(1< parseAge && parseAge<120){
            System.out.println(parseAge);
        } else throw new IllegalArgumentException("arg must be in the range [1..120], but actually is " + parseAge);
    }
}
