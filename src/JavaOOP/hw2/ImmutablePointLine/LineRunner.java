package JavaOOP.hw2.ImmutablePointLine;

import java.util.Scanner;

public class LineRunner {
    public static void main(String[] args) {
        Point point0 = getPoint();
        Point point1 = getPoint();
        Point point2 = getPoint();
        Point point3 = getPoint();

        Line line = new Line(point0, point1 );
        System.out.println(line.toString());
        Line line1 = new Line(point1, point2);
        System.out.println(line1.toString());
        Line line2 = new Line(point2, point3);
        System.out.println(line2.toString());

        Lines lines = new Lines();
        lines.add(line);
        lines.add(line1);
        lines.add(line2);
        System.out.println(lines.longestLinetoString());
        System.out.println(lines.lengthString());

    }

    private static Point getPoint() {
        System.out.println("Point coordinate x");
        int x = Input();
        System.out.println("Point coordinate y");
        int y = Input();
        Point point = new Point(x,y);
        System.out.println("XPoint: " + point.getX());
        System.out.println("YPoint: " + point.getY());
        return point;
    }

    private static int Input() {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter positive number: ");
            while (!scanner.hasNextInt()) {
                scanner.next();

                System.out.println("Illegal input");
                System.out.print("Enter positive number: ");
            }
            num = scanner.nextInt();
        } while (num <= 0);
        return num;
    }
}
