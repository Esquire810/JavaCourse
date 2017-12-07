package JavaStart.Arrays;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int [] a = {3, 8, 5, 7};
        int tmp;
        int length = a.length;
        for(int i = 0; i < length/2; i++){
            length--;
            tmp = a[i];
            a[i] = a[length];
            a[length] = tmp;
        }
        System.out.println(Arrays.toString(a));
    }
}
