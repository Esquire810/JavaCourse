package JavaStart.Methods;

public class MethodRangeSum {
    public static void main(String[] args) {
        int sum1 = sum(1, 100);
        int sum2 = sum(200, 300);
        int sum = sum1 + sum2;
        System.out.println("sum = " + sum);
    }

    public static int sum (int from, int to){
        int sum = 0;
        for (int n = from; n <= to; n++) {
            sum += n;
        }
        return sum;
    }
}
