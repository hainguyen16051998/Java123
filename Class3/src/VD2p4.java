import java.util.Scanner;

public class VD2p4 {
    public static void main(String[] args) {
        System.out.println("nhập số n: ");
        int n = new Scanner(System.in).nextInt();
        double S = 0;
        for (int i = 1; i <= n; i++) {
            S += (double) 1 / n;
        }
        System.out.println(S);
    }
}
