package JavaStart.hw4.conditionalConstructions;

import java.util.Scanner;

public class ifAB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        if(a<b){
            System.out.println(-1);
        } else if(a==b){
            System.out.println(0);
        }else if (a>b){
            System.out.println(+1);
        }
    }
}
