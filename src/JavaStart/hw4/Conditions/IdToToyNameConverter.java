package JavaStart.hw4.Conditions;

import java.util.Scanner;

public class IdToToyNameConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter toes id: ");
        int id = scanner.nextInt();

        if(id == 0){
            System.out.println("Car");
        } else
            if(id == 1){
                System.out.println("Lego");
            } else
                if(id == 2){
                    System.out.println("Doll");
                }else
                    if(id == 3){
                        System.out.println("Puzzle");
                    } else {
                        throw new IllegalArgumentException("toys with such id no");
                    }
    }
}
