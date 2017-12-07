package JavaStart.Lesson5EX;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int max = 100;
        int min = 1;
        int n = 1 + new Random().nextInt(100);
        System.out.println("n = " + n);
        do {
            System.out.print("Введите число [" + min + "..." + max + "]: ");
            num = scanner.nextInt();
            if(n<num){
                System.out.println("Число меньше");
                max = num;
            }else if (n>num){
                System.out.println("Число больше");
                min = num;
            }
        }while (num != n);
        System.out.println("Вы выиграли");
    }
}
