import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        System.out.println("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        int dem = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
                dem += i;
            }
        }
        System.out.println("");
        System.out.println("Tổng các số chia hết cho 7 bé hơn " + n + " là: " + dem);
    }
}
