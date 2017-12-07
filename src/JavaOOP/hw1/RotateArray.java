package JavaOOP.hw1;

import java.util.Scanner;

public class RotateArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = scanner.nextInt();
        int [][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = n*i + j;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("How many degrees to turn (90, 180, 270): ");
        int degrees = scanner.nextInt();
        System.out.print("Write clockwise or counter-clockwise: ");
        String clock = scanner.next();
        if (clock.equals("clockwise")) {
            if(degrees == 90) {
                for (int i = 0; i < n / 2; i++) {
                    for (int j = i; j < n - 1 - i; j++) {
                        int tmp = array[i][j];
                        array[i][j] = array[n - j - 1][i];
                        array[n - j - 1][i] = array[n - i - 1][n - j - 1];
                        array[n - i - 1][n - j - 1] = array[j][n - i - 1];
                        array[j][n - i - 1] = tmp;
                    }
                }
            } else if(degrees == 180){
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++) {
                        //trouble
                        array[n - 1 - i][n - 1 - j] = array[i][j];
                    }
                }
            }
        }else if(clock.equals("counter-clockwise")) {
            for (int k = 0; k < n / 2; k++) {
                for (int j = k; j < n - 1 - k; j++) {
                    int tmp = array[k][j];
                    array[k][j] = array[j][n - 1 - k];
                    array[j][n - 1 - k] = array[n - 1 - k][n - 1 - j];
                    array[n - 1 - k][n - 1 - j] = array[n - 1 - j][k];
                    array[n - 1 - j][k] = tmp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.print("\n");
        }
    }
}
