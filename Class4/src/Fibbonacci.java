import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        System.out.println("Số cần tìm: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Tổng 2 số là: " + tong(x));
    }

    public static int tong(int a) {
        if (a == 0 || a == 1) {
            return 1;
        }
        return tong(a - 1) + tong(a - 2);
    }
}
