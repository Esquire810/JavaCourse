package JavaStart.hw2;
import java.util.Scanner;
public class BytesConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение ");
        long totalBytes = scanner.nextLong();

        long gigaByte = totalBytes / 1073741824;
        long megaByte = (totalBytes % 1073741824) / 1048576;
        long kiloByte = (totalBytes % 1048576) / 1024;
        long bytes = totalBytes % 1024;

        System.out.println(gigaByte + "GB," + megaByte + "MB," + kiloByte + "KB," + bytes + "B");
    }
}