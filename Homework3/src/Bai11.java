import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        System.out.println("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        int tong = 0;
        int le = 0;
        int chan = 0;

        // tổng các số bé hơn n
        int k = 0;
        while (k <= n) {
            tong += k;
            k++;
        }
        System.out.println("Tổng các số tự nhiên không lớn hơn " + n + " là: " + tong);


        // tổng các số lẻ bé hơn n
        int i = 1;
        while (i <= n) {
            le += i;
            i += 2;
        }
        System.out.println("Tổng các số tự nhiên lẻ không lớn hơn " + n + " là: " + le);

        // tổng các số chẵn bé hơn n
        int j = 2;
        while (j <= n) {
            chan += j;
            j += 2;
        }
        System.out.println("Tổng các số tự nhiên chẵn không lớn hơn " + n + " là: " + chan);

    }
}







