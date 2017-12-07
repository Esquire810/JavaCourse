package JavaStart.Lesson7EX;

public class TeenagersCounter {
    public static void main(String[] args) {
        int[] ages = {};
        System.out.println("Teenegers = " + teenegers(ages));

    }

    public static int teenegers(int ages[]) {
        int count = 0;
        for (int age : ages) {
            if (11 < age && age < 19) {
                count++;
            }
        }
        return count;
    }
}
