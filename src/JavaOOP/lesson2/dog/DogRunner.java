package JavaOOP.lesson2.dog;

import java.util.Scanner;

public class DogRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog dog = new Dog("Rex");
        dog.dogInfo();
        System.out.print("Bark __ times: ");
        int bark = scanner.nextInt();
        dog.bark(bark);
    }
}
