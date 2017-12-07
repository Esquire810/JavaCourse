package JavaOOP.hw2.rectangle;

import java.util.Scanner;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rectangle = getRectangle();
        Rectangle rectangle1 = getRectangle();
        Rectangle rectangle2 = getRectangle();

        Rectangles rectangles = new Rectangles();
        rectangles.addRectangle(rectangle);
        rectangles.addRectangle(rectangle1);
        rectangles.addRectangle(rectangle2);
        rectangles.printArea();
    }

    private static Rectangle getRectangle() {
        System.out.println("Rectangle width");
        int width = Input();
        System.out.println("Rectangle height");
        int height = Input();
        Rectangle rectangle = new Rectangle(width, height);
        rectangle.perimeter();
        rectangle.area();
        rectangle.rectangleInfo();
        return rectangle;
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
