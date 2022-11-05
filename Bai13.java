import java.util.Scanner;
import java.lang.Math;

public class Bai13 {
    public static void main(String[] args) {
        System.out.println("Nhập số tự nhiên m: ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println(Sochinhphuong(m,n));
    }

    public static int Sochinhphuong(int m, int n) {
        int dem = 0;
        for (int i = m; i <= n; i++) {
            int a = (int) Math.sqrt(i);
            if (a * a == i) {
                dem++;
            }
        }
        return dem;
    }
}