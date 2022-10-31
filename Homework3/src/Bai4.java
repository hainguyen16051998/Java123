import java.util.Scanner;
import java.lang.Math;

public class Bai4 {

    public static void main(String[] args) {
        System.out.print("Nhập n = ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Các số nguyên tố cần tìm là: ");
        int dem = 0;
        int i = 2;
        while (dem < n) {
            if (snt(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
        System.out.println("");
    }

    public static boolean snt(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

