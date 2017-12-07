package JavaStart.Lesson7EX;

public class LinePrinter {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter line length: ");
        // int count;
        printLine(5);
        printLine(0);
        printLine(2);
    }

    public static void printLine(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("Enter negative argument: " + count);
        }

        String star = "*";
        for (int i = 0; i < count; i++) {
            System.out.print(star);
        }

        System.out.println();
    }

}
