import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        System.out.println("Nhập vào số nguyên dương bất kỳ: ");
        int n = new Scanner(System.in).nextInt();
        int du;
        int tong = 0;
        int t = 0;
        while (n > 0) {
            du = n % 10;
            System.out.print(du + " ");
            n = n / 10;
            tong += du;
            t++;
        }
        System.out.println("");
        System.out.println("Tổng các chữ số của sô cần tìm là " + tong);
        System.out.println("Số các số cần tìm là " + t);
    }

}