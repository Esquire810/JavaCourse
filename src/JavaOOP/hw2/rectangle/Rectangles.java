package JavaOOP.hw2.rectangle;

import java.util.ArrayList;

public class Rectangles {
    private ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
    public ArrayList<Rectangle> addRectangle(Rectangle rectangle){
        rectangles.add(rectangle);
        return rectangles;
    }

    public int sumArea(){
        int sum = 0;
        for (Rectangle rectangle: rectangles) {
            sum += rectangle.area();
        }
        return sum;
    }

    public void printArea(){
        System.out.println("Sum of area of  rectangles = " + sumArea());
    }
}
