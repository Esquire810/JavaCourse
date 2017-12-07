package JavaStart.Lesson7EX;

import java.util.Arrays;

public class TeenagersFinder {
    public static void main(String[] args) {
        int[] ages = {30, 15, 12, 40, 10, 15};
        findTeenegers(ages);
    }

    public static void findTeenegers(int[] ages) {
        int[] teenAges = new int[ages.length];
        for (int i = 0; i < ages.length; i++) {
            if (11 < ages[i] && ages[i] < 19) {
                teenAges[i] = ages[i];
            }
        }
        System.out.println(Arrays.toString(teenAges));
    }
}
