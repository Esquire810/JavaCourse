package JavaStart;
import java.util.Scanner;

public class PersonInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write name ");
        String name = scanner.nextLine();
        System.out.print("Write age ");
        int age = scanner.nextInt();
        System.out.println("Hello, my name is " + name);
        System.out.println("I`m " + age + " years old");
    }
}
