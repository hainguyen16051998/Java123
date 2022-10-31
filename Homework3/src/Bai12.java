import java.util.Scanner;
import java.lang.Math;

public class Bai12 {
    public static void main(String[] args) {
        System.out.println("Nhập số tự nhiên m: ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        int dem = 0;
        for (int i = m; i <= n; i++) {
            int a = (int) Math.sqrt(i);
            if (a * a == i) {
                dem++;
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        System.out.println("Có " + dem + " số chính phương");
    }
}

