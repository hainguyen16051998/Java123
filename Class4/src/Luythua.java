import java.util.Scanner;

public class Luythua {
    public static void main(String[] args) {
        /**
         *  a mũ n = a*a*a*...*a
         */
        System.out.println("nhập cơ số: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("nhập số mũ: ");
        int n = new Scanner(System.in).nextInt();
        long kq = 1;
        for (int i = 1; i <= n; i++) {
            kq = kq * a;
        }
        System.out.println("kết quả là " + kq);
        System.out.println(dequyluythua(a, n));
    }

    public static long dequyluythua(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a*dequyluythua(a, n - 1);
    }
}
