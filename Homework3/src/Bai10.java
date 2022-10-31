import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        System.out.println("Nhập số nguyên h: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + i - 1; j++) {
                System.out.print(j < n - i + 1 ? "   " : " * ");
            }
            System.out.println("");
        }
    }
}


