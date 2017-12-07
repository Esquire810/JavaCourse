package JavaOOP.hw2.rectangle;

public class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int perimeter() {
        int p = this.width * 2 + this.height * 2;
        return p;
    }

    public int area(){
        int a = this.height * this.width;
        return a;
    }

    public void rectangleInfo(){
        System.out.println("Perimeter of rectangle = " + perimeter());
        System.out.println("Area of rectangle = " + area());
    }
}
