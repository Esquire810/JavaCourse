package JavaOOP.hw3.cinema;

public class HallForSession {
    private boolean[][] hall;

    public HallForSession(int row, int col) {
        this.hall = new boolean[row][col];
    }

    public void printArray(){
        for (boolean[] i: hall) {
            for (boolean j: i) {
                System.out.print(j+ "\t");
            }
            System.out.println();
        }
    }

    public void setHall(int i, int j) {
        if(hall[i-1][j-1]==true){
            System.out.println("That place buy");
        }
        hall[i-1][j-1] = true;
    }

    public int countBuyPlace(){
        int busy = 0;
        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall.length; j++) {
                if(hall[i][j] == true) {
                    busy++;
                }
            }
        }
        return busy;
    }

    public int countFreePlace(){
        int free = 0;
        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall.length; j++) {
                if(hall[i][j] == false) {
                    free++;
                }
            }
        }
        return free;
    }
}
