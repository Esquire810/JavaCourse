package JavaStart.hw8;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("TicTacToe");
        System.out.println("First make a move crosses");
        String[][] xo = new String[3][3];
        Scanner scanner = new Scanner(System.in);
        String ticTacToe = "_";
        for (int i = 0; i < xo.length; i++) {
            for (int j = 0; j < xo.length; j++) {
                xo[i][j] = ticTacToe;
            }

        }
        for (String[] ss : xo) {
            for (String s : ss) System.out.print(s + "\t");
            System.out.println();
        }
    }
}
