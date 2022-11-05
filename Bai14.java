import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        System.out.println("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println(tong(n));
    }

    public static float tong(int n) {
        float tong =0;
        for (int i = 1; i <= n; i++) {
             tong += 1 /(float) i;
        }
        return tong;
    }
}
