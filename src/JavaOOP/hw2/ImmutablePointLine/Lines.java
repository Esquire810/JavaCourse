package JavaOOP.hw2.ImmutablePointLine;

import java.util.ArrayList;

public class Lines {
    ArrayList<Line> lines = new ArrayList<Line>();

    public void add(Line line){
        lines.add(line);
    }

    public double sumLenght(){
        int sum = 0;
        for (Line line: lines) {
            sum += line.getLenght();
        }
        return sum;
    }

    public Line longestLine(){
        Line line = lines.get(0);
        double max = 0;
        for (Line l: lines) {
            if (l.getLenght()>max){
                max = l.getLenght();
                line = l;
            }
        }
        return line;
    }

    public String longestLinetoString() {
        return "The longest line is "+ longestLine();
    }

    public String lengthString(){
        return "Lines length is " + sumLenght();
    }
}
