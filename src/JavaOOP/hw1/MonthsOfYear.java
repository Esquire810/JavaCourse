package JavaOOP.hw1;

import java.util.Scanner;

public class MonthsOfYear {

    public static void main(String[] args) {

        int monthNum = InputMonthNumber();
        System.out.println(MonthsName(monthNum));
    }

    private static String MonthsName(int monthNum) {
        String month = null;
        if(monthNum<1 || monthNum>12)
        {
            System.out.println(month = "Illegal input ");
        }
        switch (monthNum) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
        }
        return month;
    }

    private static int InputMonthNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number: ");
        while (!scanner.hasNextInt()) {
            scanner.next();

            System.out.println("Illegal input");
            System.out.print("Try again: ");
        }
        return scanner.nextInt();
    }
}
