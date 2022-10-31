import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Nhập số nguyên n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Các ước của số đã cho: ");
        int dem = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                dem++;
            }
        }
        System.out.println("");
        System.out.println("Số đã cho có số ước là "+dem);
    }
}
