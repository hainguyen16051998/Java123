import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        System.out.println("Nhập số nguyên dương n: ");
        int n = new Scanner(System.in).nextInt();
        int S = 0;
        for (int i = 1; i <= n; i++) {
            S = S + i;
        }
        System.out.println("Tổng là: " +S);
    }
}
