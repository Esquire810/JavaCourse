package JavaStart.hw3;
import java.util.Scanner;
public class FunctionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X: ");
        double x = scanner.nextDouble();
        double f = Math.log(Math.sin(x) + Math.exp(x) * (Math.sqrt(x)/ Math.PI));
        System.out.println("Function = " + f);
    }
}
