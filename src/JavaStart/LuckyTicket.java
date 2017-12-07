package JavaStart;



public class LuckyTicket {
    public static void main(String[] args) {


        int lucky = 0;
        int allTicket = 1_000_000;

        for (int ticket = 0; ticket< allTicket; ticket++) {
            int first = 0;
            int k = 1_000;

            // t = 387182
            //
            // n = 2

            for (int i = 0; i < 3; i++) {
                int n = (ticket / k) % 10;
                k = k * 10;
                first += n;
//                System.out.println(ticket);
            }

            int second = 0;
            int b = 1;
            for (int i = 0; i < 3; i++) {
                int m = (ticket / b) % 10;
                b = b * 10;
                second += m;
//                System.out.println(ticket);
            }

            if (first == second) {
                lucky++;
            }
        }
        double luckyTicket = (double) lucky / allTicket * 100;
        System.out.println(luckyTicket);
    }
}
