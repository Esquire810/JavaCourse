package JavaOOP.hw2.ImmutablePointLine;

public class Line {
    private final Point start;
    private final Point end;
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double getLenght(){
        double length = Math.sqrt((Math.pow(end.getX()-start.getX(),2)+Math.pow(end.getY()-start.getY(),2)));
        return length;
    }

    @Override
    public String toString() {
        return "Start point [" + start.toString() + "], end point[" + end.toString() + "], length = " + getLenght();
    }
}
