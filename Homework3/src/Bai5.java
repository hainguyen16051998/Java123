import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        System.out.println("Nhập số cần kiểm tra: ");
        int n = new Scanner(System.in).nextInt();
        int Sobandau = n;
        int x = 0;
        while (n > 0) {
            x = x * 10 + n % 10;
            n = n / 10;
        }
        System.out.println("Số mới là: " + x);
        System.out.println("");
        if (x == Sobandau)
            System.out.println("là số nghịch đảo");
        if (x != Sobandau)
            System.out.println("không là số nghịch đảo");
    }
}
