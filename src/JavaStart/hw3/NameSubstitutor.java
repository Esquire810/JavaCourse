package JavaStart.hw3;
import java.util.Scanner;
public class NameSubstitutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter message: ");
        String message = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.println(message.replace("${name}", name));
    }
}
