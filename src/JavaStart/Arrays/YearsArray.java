package JavaStart.Arrays;

import java.util.Arrays;

public class YearsArray {
    public static void main(String[] args) {
        int [] years = new int [18];
        int first = 2000;
        for (int i = 0; i < 18; i++) {
           years[i] = first;
           first++;
        }
        System.out.println(Arrays.toString(years));
    }
}
