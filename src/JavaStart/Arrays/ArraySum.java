package JavaStart.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int [] num = {10, 3, 6 ,25};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("Sum = " + sum);
    }
}
