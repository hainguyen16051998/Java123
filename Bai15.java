import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        System.out.println("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println(tong(n));
    }

    public static int tong(int n) {
        int dem = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 7 == 0) {
                dem += i;
            }
        }
        return dem;
    }
}
